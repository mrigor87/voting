package com.mrigor.voting.repository.dataJpa;

import com.mrigor.voting.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Игорь on 02.02.2018.
 */
public interface CrudRestaurantRepository extends JpaRepository<Restaurant,Integer> {

}
