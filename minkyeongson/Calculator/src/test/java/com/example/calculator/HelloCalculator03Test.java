package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloCalculator03Test {
	private int input1;
	private int input2;
	private long expected;	
	private long actual;
	private HelloCalculator calculator;
	
	
	@Test
	public void addMaxIntegerValue() throws Exception{
		input1 = Integer.MAX_VALUE;
		input2 = 5;
		
		expected = Integer.MAX_VALUE + 5L;
		
		actual = calculator.add(input1, input2);
		
		//assertEquals(expected, actual);
		assertEquals("Add Max Integer Values : " + input1 + " + " + input1 + " = " + actual + ", expevted -> " + expected, expected, actual);
	}
}
