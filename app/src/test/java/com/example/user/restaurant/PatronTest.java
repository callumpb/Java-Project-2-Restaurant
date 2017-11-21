package com.example.user.restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/11/2017.
 */

public class PatronTest {
    Patron patron;
    Dish dish;

    @Before
    public void before() {
        this.patron = new Patron();
        this.dish = new Dish("Chicken Salad", 7);

    }

    @Test
    public void orderTotalIs0() {
        assertEquals(0, patron.orderTotal(), 0.01);
    }

    @Test
    public void patronOrderTotal() {
        this.patron.addOrder(dish);
        this.patron.orderTotal();
        assertEquals(7, patron.orderTotal(), 0.01);
    }

    @Test
    public void canAddToTotalNumberOfOrders() {
        patron.addOrder(dish);
        assertEquals(1, patron.totalOrders(), 0.01);
    }

    @Test
    public void canRemoveFromTotalNumberOfOrders() {
        patron.addOrder(dish);
        assertEquals(1, patron.totalOrders(), 0.01);
        patron.removeOrder(dish);
        assertEquals(0, patron.totalOrders(), 0.01);
    }
}
