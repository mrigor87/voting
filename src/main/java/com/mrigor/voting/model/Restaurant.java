package com.mrigor.voting.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Restaurant extends BaseEntity implements Serializable {
    private String name;


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
