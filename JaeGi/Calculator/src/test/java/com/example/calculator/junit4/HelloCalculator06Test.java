package com.example.calculator.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.example.calculator.HelloCalculator;

import static org.junit.Assert.assertEquals;

public class HelloCalculator06Test {
    private int input1;
    private int input2;
    private int expected;
    private int actual;
    private HelloCalculator calculator;

    @Before
    public void setUp() {
        input1 = 1;
        input2 = 3;
        calculator = new HelloCalculator();
    }
    @After
    public void tearDown() {
        calculator = null;
    }

//    @Test(timeout = 1) //ms
    @Ignore
    public void multiply() throws Exception {
        //Arrange
        input1 = 10000;
        input2 = 10000;
        expected = input1 * input2;

        //Act
        actual = calculator.multiply(input1, input2);

        //Assert
        assertEquals(expected, actual);
    }
}