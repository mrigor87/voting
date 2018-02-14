package com.mrigor.voting.to;

import java.io.Serializable;


public class RestaurantTo implements Serializable {
    private String name;
    private int overallRating;

    public RestaurantTo() {
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
                "name='" + name + '\'' +
                ", overallRating=" + overallRating +
                '}';
    }
}