package com.mrigor.voting.service;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.model.Voting;
import com.mrigor.voting.repository.dataJpa.CrudRestaurantRepository;
import com.mrigor.voting.repository.dataJpa.CrudVotingRepository;
import com.mrigor.voting.to.RestaurantTo;
import com.mrigor.voting.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Игорь on 03.02.2018.
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private CrudRestaurantRepository crudRestaurantRepository;

    @Autowired
    private CrudVotingRepository crudVotingRepository;

    @Override
    public List<RestaurantTo> getAll() {
        List<Restaurant> restaurants = crudRestaurantRepository.findAll();
        List<Voting> votingResults = crudVotingRepository.findAll();
        Map<Integer, Integer> collect = votingResults.stream().collect(
                Collectors.groupingBy(v -> v.getRestaurant().getId(), Collectors.summingInt(Voting::getRating)));
        List<RestaurantTo> restaurantsTo = restaurants.stream()
                .map(r -> new RestaurantTo(r.getId(), r.getName(), collect.getOrDefault(r.getId(), 0)))
                .collect(Collectors.toList());

        return restaurantsTo;
    }

    @Override
    public RestaurantTo get(int id) throws NotFoundException {
        RestaurantTo restaurantTo = getAll().stream().filter(r -> r.getId() == id).findAny().orElse(null);
        return restaurantTo;
    }

    @Override
    public void delete(int id) throws NotFoundException {
        crudRestaurantRepository.delete(id);
    }

    @Override
    public Restaurant create(Restaurant restaurant) {
        return crudRestaurantRepository.save(restaurant);
    }

    @Override
    public void update(Restaurant restaurant) {
        crudRestaurantRepository.save(restaurant);
    }
}
