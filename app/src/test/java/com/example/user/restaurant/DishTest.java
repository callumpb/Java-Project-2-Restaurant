package com.example.user.restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/11/2017.
 */

public class DishTest {
    Dish dish;

    @Before
    public void before() {
        //should new dish take ingredients objects?
        this.dish = new Dish("Chicken Salad", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Chicken Salad", dish.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(7, dish.getPrice(), 0.01);
    }
}
