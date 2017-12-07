package com.example.calculator.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.calculator.HelloCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class HelloCalculator05Test {
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

    @Test
    public void divide() throws Exception {
        //Arrange
        expected = 0;

        //Act
        actual = calculator.divide(input1, input2);

        //Assert
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divideWithException() throws Exception {
        //Arrange
        input1 = 1;
        input2 = 0;
        expected = 0;

        //Act
        actual = calculator.divide(input1, input2);

        //Assert
        assertEquals(expected, actual);

        fail("msg");
    }
}