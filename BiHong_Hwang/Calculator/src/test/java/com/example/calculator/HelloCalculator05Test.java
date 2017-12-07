package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloCalculator05Test {
	private int input1 = 1;
	private int input2 = 0;
	private long actual;
	private long expected;
	private HelloCalculator calculator;
	
	@Before
	public void setUp() {
		calculator = new HelloCalculator();
	}

	@Test
	public void testDivide() {
		//Arrange
		expected = 1;
		
		//Act
		actual = calculator.divide(input1, input2);
		
		//Assert
		assertEquals(expected, actual);
	}

}
