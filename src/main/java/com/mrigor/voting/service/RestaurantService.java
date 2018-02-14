package com.mrigor.voting.service;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.to.RestaurantTo;
import com.mrigor.voting.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by Игорь on 03.02.2018.
 */
public interface RestaurantService {

    List<RestaurantTo> getAll();

    RestaurantTo get(int id) throws NotFoundException;

    void delete (int id) throws NotFoundException ;

    Restaurant create(Restaurant restaurant);

    void update (Restaurant restaurant);
}
