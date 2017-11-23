package com.example.user.restaurant;

import java.util.ArrayList;

/**
 * Created by user on 17/11/2017.
 */


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

    // this method was originally going to be used
    // to help add to budget.
    // Will keep in case required later
    public float getTotalValueOfAllTables() {
        float sum = 0;
        for(Table table : tables) {
            sum = sum + table.totalBill();
        }
        return sum;
    }

    // pay bill based on the index of the table number
    public void payBill(int tableNo) {
        // setting table variable to index number of table
        Table table = tables.get(tableNo);
        // getting the totalBill of that table/index number
        // then ensuring it's a float
        float totalBill = table.totalBill();
        // adding that totalBill to the budget
        this.budget += totalBill;
        // clearing the table after paying bill
        table.clearTable();
    }

       // pays bill without using index but the table
    public void payBillNoIndex(Table table) {
        float totalBill = table.totalBill();
        this.budget += totalBill;
          table.clearTable();
        }

        // returns total bill without adding to budget
        // still to be tested
    public float getBill(int tableNo) {
        Table table = tables.get(tableNo);
        float totalBill = table.totalBill();

        return totalBill;
    }

    //EXTENSION 1 - THIS METHOD NEEDS CHANGING
    //right now this just uses showSplitEvenBill
    //method in Table to add the splitTotal to budget.
    //THE PROBLEM is this will add ONE INDIVIDUAL splitTotal
    //to the budget and not ALL the individual splitTotals
    public void paySplitEvenBill(int tableNo) {
        Table table = tables.get(tableNo);
        float splitTotal = table.showSplitEvenBill();
        this.budget += splitTotal;
        table.clearTable();
    }


    //is this method even needed?
//    public Menu getMenu() {
//        return this.menu;
//    }

}

