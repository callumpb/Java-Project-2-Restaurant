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

    public int PatronCount() {
        return this.patrons.size();
    }
}
