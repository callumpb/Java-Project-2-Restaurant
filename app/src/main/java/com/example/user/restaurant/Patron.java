package com.example.user.restaurant;

import java.util.ArrayList;

/**
 * Created by user on 19/11/2017.
 */

public class Patron {
    private ArrayList<Dish> order;

    public Patron() {
        this.order = new ArrayList<Dish>();
    }

    public int orderTotal() {
        return this.order.size();
    }

    public void addOrder(Dish dish) {
        order.add(dish);
    }

    public void removeOrder(Dish dish) {
        order.remove(dish);
    }
}
