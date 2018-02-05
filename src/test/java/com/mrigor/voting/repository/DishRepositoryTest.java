package com.mrigor.voting.repository;

import com.mrigor.voting.VotingApplication;
import com.mrigor.voting.model.Dish;
import com.mrigor.voting.model.Menu;
import com.mrigor.voting.model.Restaurant;
import com.mrigor.voting.repository.dataJpa.CrudDishRepository;
import com.mrigor.voting.repository.dataJpa.CrudRestaurantRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Игорь on 02.02.2018.
 */
@SpringBootTest(classes = VotingApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
//@Sql(value = "classpath:data.sql")
public class DishRepositoryTest {
    @Autowired
    CrudDishRepository dishRepository;

    @Autowired
    CrudRestaurantRepository restaurantRepository;




    @Test
    public void test1() throws Exception {

    }

}