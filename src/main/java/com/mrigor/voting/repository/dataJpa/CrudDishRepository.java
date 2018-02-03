package com.mrigor.voting.repository.dataJpa;

import com.mrigor.voting.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Игорь on 02.02.2018.
 */
public interface CrudDishRepository extends JpaRepository<Dish,Integer> {

}
