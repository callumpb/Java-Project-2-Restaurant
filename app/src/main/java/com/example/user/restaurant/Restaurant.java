package com.example.user.restaurant;

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
    Menu menu;



    public Restaurant(String name, float budget, Menu menu) {
        this.name = name;
        //this.budget = 1000;
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

    public void addTableToTableCount(Table table) {
        tables.add(table);
    }

    public void removeTableFromTableCount(Table table) {
        tables.remove(table);
    }

    public int totalNumberOfPatrons() {
        int sum = 0;
        for(Table table : tables) {
            sum = sum + table.patronCount();
        }
        return sum;
    }

    public float getTotalValueOfAllTables() {
        float sum = 0;
        for(Table table : tables) {
            sum = sum + table.totalBill();
        }
        return sum;
    }


    public void payBill(int tableNo) {

        Table table = tables.get(tableNo);

        float totalBill = table.totalBill();

        this.budget += totalBill;

        table.clearTable();
    }





    //is this method needed?
//    public Menu getMenu() {
//        return this.menu;
//    }

}

