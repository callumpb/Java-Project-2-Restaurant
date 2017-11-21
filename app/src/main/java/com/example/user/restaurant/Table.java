package com.example.user.restaurant;

import java.util.ArrayList;

/**
 * Created by user on 19/11/2017.
 */

//method totalPrice(), clearTable()
public class Table {
    private ArrayList<Patron> patrons;

    public Table() {
        this.patrons = new ArrayList<Patron>();
    }

    public int patronCount() {
        return this.patrons.size();
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void removePatron(Patron patron) {
        patrons.remove(patron);
    }

    public void clearTable(Patron patron) {
        patrons.clear();
    }

    // for every patron at a table
    // add the price of their dishes
    // to the total sum
    public float totalBill() {
        float sum = 0;
        for(Patron patron : patrons) {
            sum+= patron.orderTotal();
        }
        return sum;
    }

//    public int getTotalValueOfAllTables() {
//        int sum = 0;
//        for(Table table : tables) {
//            sum = sum + table.totalBill();
//        }
//        return sum;
//    }
}
