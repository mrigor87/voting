package com.mrigor.voting.repository.dataJpa;

import com.mrigor.voting.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Игорь on 02.02.2018.
 */
public interface CrudMenuRepository extends JpaRepository<Menu,Integer> {
    Menu getByRestaurantId(int restaurantId);
}
