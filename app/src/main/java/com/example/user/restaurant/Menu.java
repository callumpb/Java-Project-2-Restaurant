package com.example.user.restaurant;

import java.util.ArrayList;

/**
 * Created by user on 19/11/2017.
 */

public class Menu {
    private ArrayList<Dish> dishes;

    public Menu() {
        this.dishes = new ArrayList<Dish>();
    }

    public int dishCount() {
        return this.dishes.size();
    }

    public void addDishToMenu(Dish dish) {
         dishes.add(dish);
    }
}
