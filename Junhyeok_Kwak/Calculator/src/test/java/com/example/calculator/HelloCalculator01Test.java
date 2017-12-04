package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloCalculator01Test {
	@Test
	public void add() throws Exception{
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
	public void subtract() throws Exception{
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
}
