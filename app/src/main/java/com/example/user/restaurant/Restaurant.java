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

    //change Name.Table
    private ArrayList<Name.Table> tables;
    Menu menu;

    //Menu menu;

    public Restaurant(String name, float budget) {
        this.name = name;
        this.budget = budget;
        //change <>
        this.tables = new ArrayList<Name.Table>();
        Menu menu = new Menu();
    }


}

