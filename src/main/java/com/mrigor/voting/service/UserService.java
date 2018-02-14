package com.mrigor.voting.service;

public interface UserService {
    void vote(int userId,int restaurantId, int rating);
}
