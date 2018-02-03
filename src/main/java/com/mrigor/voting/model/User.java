package com.mrigor.voting.model;

import javax.persistence.Entity;

@Entity
public class User extends BaseEntity {

    private String name;

    public User() {
    }


    public User(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public User(String name) {
        this(null, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id + '\'' +
                ", name='" + name +
                '}';
    }
}
