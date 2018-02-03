package com.mrigor.voting.controller.admin;

import com.mrigor.voting.model.Restaurant;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Игорь on 02.02.2018.
 */
@RestController("/admin/restaurant")
public class AdminRestaurantController {

    @GetMapping("/")
    public List<Restaurant> getAll(){
        return null;
    }
    @GetMapping("/{id}")
    public List<Restaurant> get(@PathVariable int id){
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){

    }

    @PostMapping("/")
    public Restaurant create (@RequestBody Restaurant restaurant){
        return null;
    }

    @PutMapping("/{id}")
    public Restaurant update (@PathVariable int id, @RequestBody Restaurant restaurant){
        return null;
    }

}
