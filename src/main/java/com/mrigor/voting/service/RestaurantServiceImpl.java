package com.mrigor.voting.service;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.model.Voting;
import com.mrigor.voting.repository.dataJpa.CrudRestaurantRepository;
import com.mrigor.voting.repository.dataJpa.CrudVotingRepository;
import com.mrigor.voting.to.RestaurantTo;
import com.mrigor.voting.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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
  //  @Cacheable(value = "restaurant")
    public List<RestaurantTo> getAll() {
        System.out.println("******************************@@@@@@@@@@@@@@2*************************");
        List<Restaurant> restaurants = crudRestaurantRepository.findAll();
        List<Voting> votingResults = crudVotingRepository.findAll();
        Map<Integer, Integer> collect = votingResults.stream().collect(
                Collectors.groupingBy(v -> v.getRestaurant().getId(), Collectors.summingInt(Voting::getRating)));
        List<RestaurantTo> restaurantsTo = restaurants.stream()
                .map(r -> new RestaurantTo(r.getId(), r.getName(), collect.getOrDefault(r.getId(), 0)))
                .collect(Collectors.toList());
        System.out.println("******************************@@@@@@@@@@@@@@2*************************");

        return restaurantsTo;
    }

    @Override
    public RestaurantTo get(int id) throws NotFoundException {
        RestaurantTo restaurantTo = getAll().stream().filter(r -> r.getId() == id).findAny().orElse(null);
        return restaurantTo;
    }

    @Override
 //   @CacheEvict(value = "restaurant")
    public void delete(int id) throws NotFoundException {
        crudRestaurantRepository.delete(id);
    }

    @Override
  //  @CacheEvict(value = "restaurant")
    public Restaurant create(Restaurant restaurant) {
        return crudRestaurantRepository.save(restaurant);
    }

    @Override
  //  @CacheEvict(value = "restaurant")
    public void update(Restaurant restaurant) {
        crudRestaurantRepository.save(restaurant);
    }
}
