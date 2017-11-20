package com.example.user.restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/11/2017.
 */

public class MenuTest {
    Menu menu;

    @Before
    public void before() {
        Menu menu = new Menu();
    }

    @Test
    public void menuDishCount() {
        assertEquals(0, menu.dishCount());
    }

    @Test
    public void canAddDishToMenu() {
        assertEquals(1, menu.dishCount());
    }
}
