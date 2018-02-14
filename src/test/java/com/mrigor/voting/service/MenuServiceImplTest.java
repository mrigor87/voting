package com.mrigor.voting.service;

import com.mrigor.voting.to.DishTo;
import com.mrigor.voting.VotingApplication;
import com.mrigor.voting.util.exception.NotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Игорь on 03.02.2018.
 */
@SpringBootTest(classes = VotingApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@Sql(value = "classpath:data.sql")
public class MenuServiceImplTest {
    @Autowired
    MenuService service;

    @Test
    public void getMenu() throws Exception {
        System.out.println(service.getMenu(100000));
    }
    //@Test (expected = NotFoundException.class)
    public void getMenuErr() throws Exception {
        System.out.println(service.getMenu(1));
    }


    @Test
    public void setMenu() throws Exception {
        List<DishTo> newDishes= Arrays.asList(
                new DishTo("new dish1",28.21),
                new DishTo("new dish2",28.21),
                new DishTo("new dish3",21.21),
                new DishTo("new dish4",22.21),
                new DishTo("new dish5",23.21));
        service.setMenu(newDishes,100000);
        System.out.println(service.getMenu(100000));
    }

}