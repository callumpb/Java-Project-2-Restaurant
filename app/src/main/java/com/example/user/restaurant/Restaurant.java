package com.example.user.restaurant;

import com.sun.tools.javac.util.Name;

import java.awt.Menu;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 17/11/2017.
 */

//NOTES:
    //MENU menu not connected to Menu class?

public class Restaurant {

    private String name;
    private float budget;
    private ArrayList<Table> tables;
    com.example.user.restaurant.Menu menu;



    public Restaurant(String name, float budget) {
        this.name = name;
        //this.budget = 0;
        this.budget = budget;
        this.tables = new ArrayList<Table>();
        this.menu = menu;
    }

    public String getName() {
        return this.name;
    }

    public float getBudget() {
        return this.budget;
    }

    public int tableCount() {
        return this.tables.size();
    }

    //is this method needed?
    public com.example.user.restaurant.Menu getMenu() {
        return this.menu;
    }
}

