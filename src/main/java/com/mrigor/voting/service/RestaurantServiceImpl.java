package com.mrigor.voting.service;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.repository.dataJpa.CrudRestaurantRepository;
import com.mrigor.voting.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Игорь on 03.02.2018.
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private CrudRestaurantRepository crudRestaurantRepository;

    @Override
    public List<Restaurant> getAll() {
        return crudRestaurantRepository.findAll();
    }

    @Override
    public Restaurant get(int id) throws NotFoundException {
        return crudRestaurantRepository.getOne(id);
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
