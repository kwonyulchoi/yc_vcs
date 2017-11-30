package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloCalculator05Test {
	@Test(expected = ArithmeticException.class)
	public void divide() throws Exception {
		//Arrange
		int input1 = 1;
		int input2 = 0;
		int expected = 4;
		HelloCalculator calculator = new HelloCalculator();
		
		//Act
		int actual = calculator.divide(input1, input2);
		
		//Assert
		assertEquals(expected, actual);
	}
}
