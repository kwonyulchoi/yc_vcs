package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloCalcluator05Test {
	private int input1;
	private int input2;
	private long expected;
	private long actual;
	private HelloCalculator calculator;
	
	@Before
	public void setUp() {
		//input1 = 1;
		//input2 = 3;
		calculator = new HelloCalculator();
	}
	
	@After
	public void tearDown() {
		calculator = null;
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideWithException() throws Exception{
		//Arrange
		input1 = 1;
		input2 = 0;
		expected = 0;
		
		//Act
		actual = calculator.divide(input1, input2);
		
		//Assert
		assertEquals(expected, actual);
	}
}
