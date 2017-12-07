package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloCalculator05Test {

	private int input1 = 1;
	private int input2 = 0;
	private HelloCalculator calculator;
	
	@Before
	public void setUp() {
		calculator = new HelloCalculator();
	}
	
	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}



	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		int expected = 1;
		
		int actual = calculator.divide(input1, input2);
		
		assertEquals(expected,actual);
	}
}