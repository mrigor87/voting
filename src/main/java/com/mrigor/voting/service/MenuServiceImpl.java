package com.mrigor.voting.service;

import com.mrigor.voting.TO.DishTo;
import com.mrigor.voting.model.Dish;
import com.mrigor.voting.model.Menu;
import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.repository.dataJpa.CrudDishRepository;

import com.mrigor.voting.repository.dataJpa.CrudRestaurantRepository;
import com.mrigor.voting.util.exception.ExceptionUtil;
import com.mrigor.voting.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static com.mrigor.voting.util.exception.ExceptionUtil.checkNotFound;

/**
 * Created by Игорь on 03.02.2018.
 */
@Service
public class MenuServiceImpl implements MenuService {


    @Autowired
    CrudDishRepository crudDishRepository;

    @Autowired
    CrudRestaurantRepository crudRestaurantRepository;

    @Override
    public List<DishTo> getMenu(int restaurantId) {

        List<Dish> dishes = crudDishRepository.getAllByRestaurantId(restaurantId);
        ExceptionUtil.checkNotFound(dishes, restaurantId);
        List<DishTo> dishesTo = dishes.stream()
                .map(DishTo::new).collect(Collectors.toList());
        return dishesTo;
    }

    @Override
    @Transactional
    public void setMenu(List<DishTo> dishes, int restaurantId) {
        crudDishRepository.deleteAllByRestaurantId(restaurantId);
        Restaurant restaurant=crudRestaurantRepository.getOne(restaurantId);
        List<Dish> dishesTo = dishes.stream()
                .map(dishTo -> new Dish(dishTo.getName(), dishTo.getPrice(), restaurant))
                .collect(Collectors.toList());
        crudDishRepository.save(dishesTo);


    }
}
