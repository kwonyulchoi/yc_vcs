package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloCalculator02Test {
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
	public void add() throws Exception{
		//Arrange
		expected = 0;
		
		//Act
		int actual = calculator.add(input1, input2);
		
		//Assert
		//assertEquals(expected, actual);
		
		//Assertion Message
		assertEquals("Add Max Integer Values : " + input1 + " + " + input2 + " = " + actual + ", expected -> " + expected
						, expected, actual);
		
	}
	
}
