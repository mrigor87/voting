package com.mrigor.voting.service;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.model.User;
import com.mrigor.voting.repository.dataJpa.CrudRestaurantRepository;
import com.mrigor.voting.repository.dataJpa.CrudUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    CrudUserRepository userRepository;

    @Autowired
    CrudRestaurantRepository restaurantRepository;

    @Override
    @Transactional
    //  @CacheEvict(value = "restaurant")
    public void vote(int userId, int restaurantId, int rating) {
        Restaurant restaurant = restaurantRepository.findOne(restaurantId);
        User user = userRepository.findOne(userId);
        user.setVotedFor(restaurant);
        userRepository.save(user);

    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
