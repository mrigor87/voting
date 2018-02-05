package com.mrigor.voting.service;

import com.mrigor.voting.TO.DishTo;
import com.mrigor.voting.model.Dish;
import com.mrigor.voting.model.Menu;

import java.util.List;

/**
 * Created by Игорь on 03.02.2018.
 */
public interface MenuService {

    List<DishTo> getMenu (int restaurantId);

    void setMenu(List<DishTo> dishes, int restaurantId);


}
