package com.mrigor.voting.repository.dataJpa;

import com.mrigor.voting.model.Dish;
import com.mrigor.voting.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Игорь on 02.02.2018.
 */
public interface CrudDishRepository extends JpaRepository<Dish, Integer> {

    //@Query("SELECT d FROM Dish d where d.restaurant.id=:restaurantId")
    List<Dish> getAllByRestaurantId(int restaurantId);

    void deleteAllByRestaurantId(int restaurantId);

}
