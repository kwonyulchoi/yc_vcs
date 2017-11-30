package com.example.calculator;

import static org.junit.Assert.*;

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
	@Test
	public void testAdd() throws Exception {
		//fail("Not yet implemented");
		expected =4;
		actual = calculator.add(input1, input2);
		assertEquals(expected,actual);
	}


}
