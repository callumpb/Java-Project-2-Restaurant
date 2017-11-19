package com.example.user.restaurant;

import java.util.ArrayList;

/**
 * Created by user on 19/11/2017.
 */

public class Dish {
    private String name;
    private float price;
    private ArrayList<Ingredient> ingredients;

    public Dish(String name, float price) {
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<Ingredient>();
    }
}
