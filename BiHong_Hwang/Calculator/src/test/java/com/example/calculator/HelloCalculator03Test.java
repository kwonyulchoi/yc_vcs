package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.After;
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
	
	@After
	public void tearDown() {
		calculator = null;
	}

	@Test
	public void testAdd() {
		//Arrange
		expected = 4;
		
		//Act
		actual = calculator.add(input1, input2);
		
		//Assert
		assertEquals("Add : " + input1 + " + " + input2 + " = " + actual + ", expected -> " + expected, expected, actual);
	}
}
