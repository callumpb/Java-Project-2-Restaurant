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
    Menu menu;

    @Before
    public void before() {
        this.restaurant = new Restaurant("Mario's", 0);
        this.table = new Table();
        this.menu = new Menu();
    }

    @Test
    public void hasName() {
        assertEquals("Mario's", restaurant.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(0, restaurant.getBudget(), 0.01);
    }

//    @Test
//    //the amount that a patron pays for a dish
//    public void canAddToBudget() {
//
//    }

    @Test
    public void tableCountIs0() {
        assertEquals(0, restaurant.tableCount());
    }

    @Test
    public void canAddTable() {
        restaurant.addTableToTableCount(table);
        assertEquals(1, restaurant.tableCount());
    }

    @Test
    public void canRemoveTable() {
        restaurant.addTableToTableCount(table);
        assertEquals(1, restaurant.tableCount());
        restaurant.removeTableFromTableCount(table);
        assertEquals(0, restaurant.tableCount());
    }

    //is this + Restaurant method needed?
//    @Test
//    public void canHaveMenu() {
//        assertEquals(menu, restaurant.getMenu());
//    }
}
