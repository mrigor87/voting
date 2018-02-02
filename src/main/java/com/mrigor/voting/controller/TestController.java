package com.mrigor.voting.controller;

import com.mrigor.voting.model.Dish;
import com.mrigor.voting.model.Menu;
import com.mrigor.voting.model.Restaurant;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @PersistenceContext
    EntityManager em;

    @GetMapping("/")
    @Transactional
    List<Dish> test() {
        Menu menu = new Menu();
        em.find(Menu.class,menu);
        Restaurant restaurant = new Restaurant("Restaurant 1", menu);
        em.persist(restaurant);
        List<Dish> dishes = new ArrayList<>();
        menu.setDishes(dishes);

        dishes.add(new Dish("food1", 10.25));
        dishes.add(new Dish("food2", 1.00));
        em.persist(restaurant);
        System.out.println(restaurant);
        return dishes;
    }
}
