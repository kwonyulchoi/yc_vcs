package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloCaclulator03Test {
	private int input1;
	private int input2;
	private long expected;
	private int actual;
	private HelloCalculator calculator;
	
	@Before
	public void setUp() {
		input1 = 1;
		input2 = 3;
		calculator = new HelloCalculator();
	}
	
	@Test
	public void addMaxIntegerValue() throws Exception{
		//Arrange
		input1 = Integer.MAX_VALUE;
		input2 = 5;
		expected = Integer.MAX_VALUE + 5L;
		
		//Act
		actual = calculator.add(input1, input2);
		
		//Assert
		assertEquals("Add Max Integer Values:" + input1 + " + " + input1 + " = " + actual + ", expected ->" + expected, expected, actual);
	}

}
