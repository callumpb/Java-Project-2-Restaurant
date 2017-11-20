package com.example.user.restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/11/2017.
 */

public class IngredientTest {
    Ingredient ingredient;

    @Before
    public void before() {
        this.ingredient = new Ingredient("Salad");
    }

    @Test
    public void hasName() {
        assertEquals("Salad", ingredient.getName());
    }
}
