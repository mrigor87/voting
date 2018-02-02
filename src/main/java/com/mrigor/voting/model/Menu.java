package com.mrigor.voting.model;

import javax.persistence.*;
import java.util.List;

@Embeddable
public class Menu {

    @OneToMany
    private List<Dish> dishes;





    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Menu() {
    }

    public Menu(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
