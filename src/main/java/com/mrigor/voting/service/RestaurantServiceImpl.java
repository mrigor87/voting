package com.mrigor.voting.service;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.repository.dataJpa.CrudRestaurantRepository;
import com.mrigor.voting.to.RestaurantTo;
import com.mrigor.voting.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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



    @Override
    //  @Cacheable(value = "restaurant")
    @Transactional
    public List<RestaurantTo> getAll() {
        List<Restaurant> restaurants = crudRestaurantRepository.findAll();
        return restaurants.stream()
                .map(RestaurantTo::new)
                .collect(Collectors.toList());
    }

    @Override
    public RestaurantTo get(int id) throws NotFoundException {
        Restaurant restaurant = crudRestaurantRepository.getOne(id);
        return new RestaurantTo(restaurant);
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
