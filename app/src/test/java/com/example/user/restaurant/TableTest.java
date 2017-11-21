package com.example.user.restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/11/2017.
 */

public class TableTest {
    Table table;
    Patron patron;
    Dish order;
    Ingredient chicken, salad, steak;
    Dish chickenSaladDish, steakDish;

    @Before
    public void before() {

        this.table = new Table();
        this.patron = new Patron();

//        chicken = new Ingredient("chicken");
//        salad = new Ingredient("salad");
//        steak = new Ingredient("steak");

        chickenSaladDish = new Dish("chicken salad", 7);
        steakDish = new Dish("steak", 10);



    }

    @Test
    public void tablePatronCount() {
        assertEquals(0, table.patronCount());
    }

    @Test
    public void addPatronToTablePatronCount() {
        table.addPatron(patron);
        assertEquals(1, table.patronCount());
    }

    @Test
    public void removePatronFromTablePatronCount() {
        table.addPatron(patron);
        assertEquals(1, table.patronCount());
        table.removePatron(patron);
        assertEquals(0, table.patronCount());
    }

    @Test
    public void setTableTo0Patrons() {
        table.addPatron(patron);
        assertEquals(1, table.patronCount());
        table.clearTable(patron);
        assertEquals(0, table.patronCount());
    }

    @Test
    public void getTotalBillOfPatronsAtTable() {
        this.table.addPatron(patron);
        this.patron.addOrder(chickenSaladDish);
        this.patron.orderTotal();
//        float actual = table.totalBill();
        assertEquals(7, table.totalBill(), 0.01);

    }

}
