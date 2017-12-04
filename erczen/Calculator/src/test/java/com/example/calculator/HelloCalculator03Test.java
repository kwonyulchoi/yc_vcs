package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloCalculator03Test {
	private int input1;
	private int input2;
	private long expected;
	private long actual;
	private HelloCalculator calculator;
	
	@Before
	public void setUp() {
		input1 = 1;
		input2 = 3;
		calculator = new HelloCalculator();
	}
	
	@Test
	public void addMaxIntegerValue() throws Exception {
		//Arrange
		input1 = Integer.MAX_VALUE;
		input2 = 5;
		expected = Integer.MAX_VALUE + 5L;
		
		//Act
		actual = calculator.add(input1, input2);
		
		//Assert
		assertEquals("Add Max Integer Value : " + input1 + " + " + input2 + " = " + actual + ", expected -> " + expected, expected, actual);
	}
}
