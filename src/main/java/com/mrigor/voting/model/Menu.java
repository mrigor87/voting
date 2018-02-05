package com.mrigor.voting.model;

import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

//@Entity
//@Embeddable
public class Menu{

 //   @ManyToOne
    private Restaurant restaurant;

 //  @OneToMany (fetch = FetchType.EAGER)
   // @JoinColumn(name = "menu_id")
    private List<Dish> dishes;

 //   @Column(columnDefinition = "timestamp default now()")
 //   private LocalDate currDate;



    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Menu() {
      //  this.currDate = LocalDate.now();
    }


    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

/*    public LocalDate getCurrDate() {
        return currDate;
    }

    public void setCurrDate(LocalDate currDate) {
        this.currDate = currDate;
    }*/

    public Menu( Restaurant restaurant, List<Dish> dishes) {
        this.restaurant = restaurant;
        this.dishes = dishes;
     //   this.currDate = LocalDate.now();
    }


    public Menu(Restaurant restaurant) {
        this(restaurant, Collections.<Dish>emptyList());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Menu{");
        sb.append(", restaurant=").append(restaurant);
        sb.append(", dishes=").append(dishes);
      //  sb.append(", currDate=").append(currDate);

        sb.append('}');
        return sb.toString();
    }
}
