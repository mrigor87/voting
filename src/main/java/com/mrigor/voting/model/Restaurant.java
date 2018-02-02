package com.mrigor.voting.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Restaurant extends BaseEntity {
    private String name;

    @Embedded
    private Menu menu;

    public Restaurant() {
    }


    public Restaurant(Integer id, String name, Menu menu) {
        super(id);
        this.name = name;
        this.menu = menu;
    }

    public Restaurant(String name, Menu menu) {
        this(null, name, menu);
    }

    public Restaurant(String name) {
        this(null, name, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                ", id=" + id +
                "name='" + name + '\'' +
                '}';
    }
}
