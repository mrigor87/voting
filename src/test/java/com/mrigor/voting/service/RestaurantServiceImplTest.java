package com.mrigor.voting.service;

import com.mrigor.voting.VotingApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@SpringBootTest(classes = VotingApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@Sql(value = "classpath:data.sql")
public class RestaurantServiceImplTest {
    @Test
    public void getAll() throws Exception {
    }

    @Test
    public void get() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void create() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

}