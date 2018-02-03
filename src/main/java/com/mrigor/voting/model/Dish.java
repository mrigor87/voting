package com.mrigor.voting.model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
public class Dish extends BaseEntity {
    private String name;
    private Double price;



    public Dish() {}

    public Dish(Integer id, String name, Double price) {
        super(id);
        this.name = name;
        this.price = price;
    }

    public Dish(String name, Double price) {
        this(null, name, price);
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
        final StringBuilder sb = new StringBuilder("Dish{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
