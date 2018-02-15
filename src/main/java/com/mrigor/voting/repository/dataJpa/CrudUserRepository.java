package com.mrigor.voting.repository.dataJpa;

import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CrudUserRepository extends JpaRepository<User,Integer> {

/*    @Query("UPDATE USER u SET u.votedFor=:restaurant where u.id=100005")
    void vote(@Param("restaurant")Restaurant restaurant);*/
}
