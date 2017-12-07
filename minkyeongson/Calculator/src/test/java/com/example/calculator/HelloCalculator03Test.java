package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloCalculator03Test {
	private int input1;
	private int input2;
	private int expected;	
	private int actual;
	private HelloCalculator calculator;
	
	
	@Test
	public void addMaxIntegerValue() throws Exception{
		input1 = 1;
		input2 = 5;
		
		calculator = new HelloCalculator();
		expected = 1 + 5;
		
		actual = calculator.add(input1, input2);
		
		//assertEquals(expected, actual);
		assertEquals("Add Max Integer Values : " + input1 + " + " + input1 + " = " + actual + ", expevted -> " + expected, expected, actual);
	}
}
