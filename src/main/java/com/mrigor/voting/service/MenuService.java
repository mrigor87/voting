package com.mrigor.voting.service;

import com.mrigor.voting.to.DishTo;

import java.util.List;

/**
 * Created by Игорь on 03.02.2018.
 */
public interface MenuService {

    List<DishTo> getMenu (int restaurantId);

    void setMenu(List<DishTo> dishes, int restaurantId);


}
