package com.mrigor.voting.service;

import com.mrigor.voting.model.User;

import java.util.List;

public interface UserService {
    void vote(int userId,int restaurantId, int rating);
        List<User> getAll();
}
