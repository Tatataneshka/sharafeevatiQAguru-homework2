package com.qagurusharafeeva.docs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5Examples {
    @BeforeEach
    void beforeEach(){
        System.out.println("Print Before test!");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Print after test!\n");
    }

     @Test
    void firstTest(){
         System.out.println("I love you QA.GURU");
     }
    @Test
    void secondTest(){
        System.out.println("I love you too secondTest");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("the first of firsts\n");
    }
}
