package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloCalculator01Test {

	@Test
	public void testAdd() throws Exception{
		//fail("Not yet implemented");
		int input1 = 1;
		int input2 = 2;
		long expected= 4;
		HelloCalculator c = new HelloCalculator();
		
		long actual = c.add(input1, input2);
		assertEquals(expected,actual);
	}
}
