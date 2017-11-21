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
    Table table, table1, table2;
    Ingredient chicken, salad;
    Dish chickenSaladDish;
    Menu menu;
    Patron patron1, patron2;


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
        this.table1 = new Table();
        this.table2 = new Table();
        chickenSaladDish = new Dish("chicken salad", 7);


        patron1 = new Patron();
        patron2 = new Patron();
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
        int totalPatrons = this.restaurant.totalNumberOfPatrons();
        assertEquals(3, totalPatrons);
    }

    @Test
    public void totalValueOfAllTables() {

        this.table1.addPatron(patron1);
        this.table1.addPatron(patron2);
        this.table2.addPatron(patron1);
        assertEquals(2, table1.patronCount());
        assertEquals(1, table2.patronCount());
        this.restaurant.addTableToTableCount(table1);
        this.restaurant.addTableToTableCount(table2);
        assertEquals(2, restaurant.tableCount());

        this.patron1.addOrder(chickenSaladDish);
        this.patron2.addOrder(chickenSaladDish);
        assertEquals(14, table1.totalBill(), 0.01);
        assertEquals(7, table2.totalBill(), 0.01);
//        this.patron1.orderTotal();

        assertEquals(21, restaurant.getTotalValueOfAllTables(),
                0.01 );
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
