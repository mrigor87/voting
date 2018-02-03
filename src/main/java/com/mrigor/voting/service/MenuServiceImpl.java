package com.mrigor.voting.service;

import com.mrigor.voting.model.Dish;
import com.mrigor.voting.model.Menu;
import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.repository.dataJpa.CrudDishRepository;
import com.mrigor.voting.repository.dataJpa.CrudMenuRepository;
import com.mrigor.voting.repository.dataJpa.CrudRestaurantRepository;
import com.mrigor.voting.util.exception.ExceptionUtil;
import com.mrigor.voting.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.mrigor.voting.util.exception.ExceptionUtil.checkNotFound;

/**
 * Created by Игорь on 03.02.2018.
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    CrudMenuRepository crudMenuRepository;

    @Autowired
    CrudDishRepository crudDishRepository;

    @Autowired
    CrudRestaurantRepository crudRestaurantRepository;

    @Override
    public Menu getMenu(int restaurantId) {
        Menu menu = crudMenuRepository.getByRestaurantId(restaurantId);
        checkNotFound(menu,restaurantId);
        return menu;
    }

    @Override
    public void setMenu(List<Dish> dishes, int restaurantId) {
        crudRestaurantRepository.findAll();
        Restaurant restaurant=crudRestaurantRepository.getOne(restaurantId);
        checkNotFound(restaurant,restaurantId);
        List<Dish> save = crudDishRepository.save(dishes);
        Menu menu=new Menu(restaurant,save);
        crudMenuRepository.save(menu);
    }
}
