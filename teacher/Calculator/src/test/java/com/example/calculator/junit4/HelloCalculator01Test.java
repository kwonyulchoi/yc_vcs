package com.example.calculator.junit4;

import org.junit.Test;

import com.example.calculator.HelloCalculator;

import static org.junit.Assert.assertEquals;

public class HelloCalculator01Test {
    @Test
    public void add() throws Exception {
        //Arrange
        int input1 = 1;
        int input2 = 3;
        int expected = 4;
        HelloCalculator calculator = new HelloCalculator();

        //Act
        int actual = calculator.add(input1, input2);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void subtract() throws Exception {
        //Arrange
        int input1 = 1;
        int input2 = 3;
        int expected = -2;
        HelloCalculator calculator = new HelloCalculator();

        //Act
        int actual = calculator.subtract(input1, input2);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void multiply() throws Exception {
        //Arrange
        int input1 = 1;
        int input2 = 3;
        int expected = 3;
        HelloCalculator calculator = new HelloCalculator();

        //Act
        int actual = calculator.multiply(input1, input2);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void divide() throws Exception {
        //Arrange
        int input1 = 1;
        int input2 = 3;
        int expected = 0;
        HelloCalculator calculator = new HelloCalculator();

        //Act
        int actual = calculator.divide(input1, input2);

        //Assert
        assertEquals(expected, actual);
    }
}