package com.mrigor.voting.controller.profile;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profile/restaurant")
public class ProfileRestaurantController {
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
}
