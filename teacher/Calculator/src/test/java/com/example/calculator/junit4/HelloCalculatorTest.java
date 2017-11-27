package com.example.calculator.junit4;

import org.junit.Test;

import com.example.calculator.HelloCalculator;

import static org.junit.Assert.*;

public class HelloCalculatorTest {
    @Test
    public void add() throws Exception {
        assertEquals(4, new HelloCalculator().add(1, 3));
    }

    @Test
    public void subtract() throws Exception {
        assertEquals(-2, new HelloCalculator().subtract(1, 3));
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(3, new HelloCalculator().multiply(1, 3));
    }

    @Test
    public void divide() throws Exception {
        assertEquals(0, new HelloCalculator().divide(1, 3));
    }
}