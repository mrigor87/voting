package com.mrigor.voting.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Restaurant extends BaseEntity {
    private String name;


    public Restaurant() {
    }


    public Restaurant(Integer id, String name, Menu menu) {
        super(id);
        this.name = name;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Restaurant{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');

        sb.append('}');
        return sb.toString();
    }
}
