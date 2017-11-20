package com.example.user.restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/11/2017.
 */

public class TableTest {
    Table table;
    Patron patron;

    @Before
    public void before() {
        this.table = new Table();
        this.patron = new Patron();
    }

    @Test
    public void tablePatronCount() {
        assertEquals(0, table.patronCount());
    }

    @Test
    public void addPatronToTablePatronCount() {
        table.addPatron(patron);
        assertEquals(1, table.patronCount());
    }

    @Test
    public void removePatronFromTablePatronCount() {
        table.addPatron(patron);
        assertEquals(1, table.patronCount());
        table.removePatron(patron);
        assertEquals(0, table.patronCount());
    }
}
