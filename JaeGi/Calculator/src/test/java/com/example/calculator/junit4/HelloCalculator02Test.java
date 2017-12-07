package com.example.calculator.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.calculator.HelloCalculator;

import static org.junit.Assert.assertEquals;

public class HelloCalculator02Test {
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
    public void add() throws Exception {
        //Arrange
        expected = 4;

        //Act
        actual = calculator.add(input1, input2);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void subtract() throws Exception {
        //Arrange
        expected = -2;

        //Act
        actual = calculator.subtract(input1, input2);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void multiply() throws Exception {
        //Arrange
        expected = 3;

        //Act
        actual = calculator.multiply(input1, input2);

        //Assert
        assertEquals(expected, actual);
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
}