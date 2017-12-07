package com.example.calculator.junit4;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.example.calculator.HelloCalculator;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.DEFAULT)
//@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HelloCalculator07Test {
    @Test
    public void TC00_add() throws Exception {
        assertEquals(4, new HelloCalculator().add(1, 3));
    }

    @Test
    public void TC01_subtract() throws Exception {
        assertEquals(-2, new HelloCalculator().subtract(1, 3));
    }

    @Test
    public void TC02_multiply() throws Exception {
        assertEquals(3, new HelloCalculator().multiply(1, 3));
    }

    @Test
    public void TC03_divide() throws Exception {
        assertEquals(0, new HelloCalculator().divide(1, 3));
    }
}