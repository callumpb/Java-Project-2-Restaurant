package com.example.user.restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 20/11/2017.
 */

public class MenuTest {
    Menu menu;
    Dish dish;

    @Before
    public void before() {
        menu = new Menu();
        dish = new Dish("Chicken Salad", 7);
    }

    @Test
    public void menuDishCount() {
        assertEquals(0, menu.dishCount());
    }

    @Test
    public void canAddDishToMenu() {
        menu.addDishToMenu(dish);
        assertEquals(1, menu.dishCount());
    }

    @Test
    public void canRemoveDishFromMenu() {
        menu.addDishToMenu(dish);
        assertEquals(1, menu.dishCount());
        menu.removeDishFromMenu(dish);
        assertEquals(0, menu.dishCount());
    }
    
}
