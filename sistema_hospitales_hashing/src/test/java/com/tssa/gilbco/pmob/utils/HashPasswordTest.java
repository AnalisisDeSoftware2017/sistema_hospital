package com.tssa.gilbco.pmob.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by sbogado on 06/12/2016.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class HashPasswordTest {

    @Autowired
    private UserService userService;

    @Test
    public void testHashPassword(){
        System.out.println(userService.hashPassword("holaMundo"));
    }








}
