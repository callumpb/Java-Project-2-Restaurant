package com.example.user.restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 20/11/2017.
 */

public class RestaurantTest {
    Restaurant restaurant;
    Table table;

    @Before
    public void before() {
        this.restaurant = new Restaurant("Mario's", 1000);
        this.table = new Table();
    }

    @Test
    public void hasName() {
        assertEquals("Mario's", restaurant.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(1000, restaurant.getBudget(), 0.01);
    }

    @Test
    public void tableCountIs0() {
        assertEquals(0, restaurant.tableCount());
    }

    @Test
    public void canAddTable() {
        restaurant.addTableToTableCount(table);
        assertEquals(1, restaurant.tableCount());
    }

    

    //is this + Restaurant method needed?
    @Test
    public void canHaveMenu() {
        assertEquals(Menu.class, restaurant.getMenu());
    }
}
