package com.mrigor.voting.model;

import javax.persistence.Entity;

@Entity
public class Voting extends BaseEntity{

    private User user;
    private Restaurant restaurant;
    private int rating;


    public Voting() {
    }

    public Voting(User user, Restaurant restaurant, int rating) {
        this.user = user;
        this.restaurant = restaurant;
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
