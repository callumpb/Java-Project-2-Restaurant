package com.example.user.restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/11/2017.
 */

public class TableTest {
    Table table;

    @Before
    public void before() {
        this.table = new Table();
    }

    @Test
    public void tablePatronCount() {
        assertEquals(0, table.PatronCount());
    }

}
