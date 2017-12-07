package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloCalculator05Test {
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
		expected = 4;
		
		actual = calculator.add(input1, input2);
		
		assertEquals(expected, actual);
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideWithException() throws Exception {
		input1 = 1;
		input2 = 0;
		expected = 0;
		
		actual = calculator.divide(input1, input2);
		
		assertEquals(expected, actual);
	}
}
