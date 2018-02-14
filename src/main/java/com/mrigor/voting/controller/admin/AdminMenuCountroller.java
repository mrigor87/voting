package com.mrigor.voting.controller.admin;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.service.MenuService;
import com.mrigor.voting.to.DishTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/restaurant/{id}/menu")
public class AdminMenuCountroller {
    @Autowired
    MenuService service;

    @GetMapping
    public List<DishTo> getMenu(@PathVariable int id){
        return service.getMenu(id);
    }

   @PostMapping
    public void setMenu(@PathVariable int id, @RequestBody List<DishTo> dishes){
        service.setMenu(dishes, id);
   }
}
