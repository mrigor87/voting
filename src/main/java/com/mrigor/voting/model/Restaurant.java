package com.mrigor.voting.model;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Restaurant extends BaseEntity implements Serializable {
    private String name;

    @OneToMany (mappedBy = "votedFor")
/*    @JoinTable(name = "voting",
            joinColumns = @JoinColumn(name = "restaurant_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))*/
    private Set<User> voted;

    public Set<User> getVoted() {
        return voted;
    }

    public void setVoted(Set<User> voted) {
        this.voted = voted;
    }
    // @Transient
    //@OneToMany
    // @JoinColumn(name = "menu_id")
    //  private List<Dish> dishes;


    public Restaurant() {
    }


    public Restaurant(Integer id, String name) {
        super(id);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Restaurant{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');

        sb.append('}');
        return sb.toString();
    }
}
