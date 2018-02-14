package com.mrigor.voting.to;

import com.mrigor.voting.model.Dish;

import java.io.Serializable;

/**
 * Created by Игорь on 05.02.2018.
 */
public class DishTo implements Serializable{
    private Integer id;
    private String name;
    private Double price;


    public DishTo() {
    }

    public DishTo(Dish dish) {
        this.id = dish.getId();
        this.name = dish.getName();
        this.price = dish.getPrice();
    }

    public DishTo(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public DishTo(String name, Double price) {
        this(null,name,price);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DishTo{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
