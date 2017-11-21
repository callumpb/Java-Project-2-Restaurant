package com.example.user.restaurant;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 20/11/2017.
 */

public class RestaurantTest {
    Restaurant restaurant;
    Table table, table1;
    Ingredient chicken, salad;
    Dish chickenSalad;
    Menu menu;
    Patron patron1;


    @Before
    public void before() {

        //Create a few ingredients
        //Create a few dishes
        //Create a new menu
        //Add some dishes to menu
        //Create new restaurant and pass it the menu

        //Create a few tables
        //Add tables to restaurant
        //Add patron

        this.menu = new Menu();
        this.restaurant = new Restaurant("Mario's", 0, menu);
        this.table = new Table();

        // patron
        patron1 = new Patron();
        this.table.addPatron(patron1);
        this.table.addPatron(patron1);
        this.table.addPatron(patron1);
    }

    @Test
    public void hasName() {
        assertEquals("Mario's", restaurant.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(0, restaurant.getBudget(), 0.01);
    }

    @Test
    public void getNumberOfPatrons() {
        this.restaurant.addTableToTableCount(table);
        int totalPatrons = this.restaurant.totalNumberOfPeople();
        assertEquals(3, totalPatrons);
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
