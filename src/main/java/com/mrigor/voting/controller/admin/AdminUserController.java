package com.mrigor.voting.controller.admin;

import com.mrigor.voting.model.User;
import com.mrigor.voting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Игорь on 14.02.2018.
 */
@RestController
@RequestMapping("admin/user")
public class AdminUserController {
    @Autowired
    UserService service;

    @GetMapping("/")
    public List<User> getAll(){
      return  service.getAll();
    }
}
