package com.mrigor.voting.service;

import com.mrigor.voting.model.Dish;

/**
 * Created by Игорь on 03.02.2018.
 */
public interface DishService {
    Dish createDish (Dish dish, int RestaurantId);

}
