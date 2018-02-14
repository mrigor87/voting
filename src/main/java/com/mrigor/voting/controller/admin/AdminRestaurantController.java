package com.mrigor.voting.controller.admin;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Игорь on 02.02.2018.
 */
@RestController
@RequestMapping("/admin/restaurant")
public class AdminRestaurantController {
    @Autowired
    RestaurantService service;

    @GetMapping("/")
    public List<Restaurant> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Restaurant get(@PathVariable int id) {

        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @PostMapping("/")
    public Restaurant create(@RequestBody Restaurant restaurant) {
        return service.create(restaurant);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Restaurant restaurant) {
        service.update(restaurant);
    }

}
