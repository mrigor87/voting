package com.mrigor.voting.service;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.model.User;
import com.mrigor.voting.model.Voting;
import com.mrigor.voting.repository.dataJpa.CrudRestaurantRepository;
import com.mrigor.voting.repository.dataJpa.CrudUserRepository;
import com.mrigor.voting.repository.dataJpa.CrudVotingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    CrudUserRepository userRepository;
    @Autowired
    CrudVotingRepository votingRepository;
    @Autowired
    CrudRestaurantRepository restaurantRepository;

    @Override
    public void vote(int userId, int restaurantId, int rating) {
        User user = userRepository.getOne(userId);
        Restaurant restaurant=restaurantRepository.getOne(restaurantId);
        Voting voting=new Voting(user,restaurant,rating);
    }
}
