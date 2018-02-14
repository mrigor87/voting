package com.mrigor.voting.controller.profile;

import com.mrigor.voting.AuthenticatedUser;
import com.mrigor.voting.service.MenuService;
import com.mrigor.voting.service.RestaurantService;
import com.mrigor.voting.service.UserService;
import com.mrigor.voting.to.DishTo;
import com.mrigor.voting.to.RestaurantTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile/restaurant")
public class ProfileController {
    @Autowired
    RestaurantService restaurantService;
    @Autowired
    MenuService menuService;

    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<RestaurantTo> getAll() {

        return restaurantService.getAll();
    }

    @GetMapping("/{id}")
    public RestaurantTo get(@PathVariable int id) {
        return restaurantService.get(id);
    }

    @GetMapping("/{id}/menu")
    public List<DishTo> getMenu(@PathVariable int id){
        return menuService.getMenu(id);
    }

    @PostMapping("/{id}/setRating/{rate}")
    public void vote(@PathVariable int id, @PathVariable int rate){
        userService.vote(AuthenticatedUser.getId(),id,rate);
    }
}
