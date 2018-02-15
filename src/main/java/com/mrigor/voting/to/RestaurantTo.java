package com.mrigor.voting.to;

import com.mrigor.voting.model.Restaurant;

import java.io.Serializable;


public class RestaurantTo implements Serializable {
    private int id;
    private String name;
    private int overallRating;

    public RestaurantTo() {
    }

    public RestaurantTo(int id, String name, int overallRating) {
        this.id = id;
        this.name = name;
        this.overallRating = overallRating;
    }

    public RestaurantTo (Restaurant restaurant){
        this(restaurant.getId(),restaurant.getName(),restaurant.getVoted().size());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    @Override
    public String toString() {
        return "RestaurantTo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", overallRating=" + overallRating +
                '}';
    }
}