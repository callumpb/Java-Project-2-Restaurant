package com.example.user.restaurant;

import com.sun.tools.javac.util.Name;

import java.awt.Menu;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 17/11/2017.
 */

public class Restaurant {

    private String name;
    private float budget;
    private ArrayList<Table> tables;
    Menu menu;



    public Restaurant(String name, float budget) {
        this.name = name;
        this.budget = budget;
        this.tables = new ArrayList<Table>();
        Menu menu = new Menu();
        this.menu = menu;
    }


}

