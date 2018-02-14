package com.mrigor.voting.controller.profile;

import com.mrigor.voting.service.MenuService;
import com.mrigor.voting.to.DishTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profile/restaurant/{id}/menu")
public class ProfileMenuController {
    @Autowired
    MenuService service;

    public List<DishTo> getMenu(@PathVariable int id){
        return service.getMenu(id);
    }
}
