package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloCalculatorTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		assertEquals(4, new HelloCalculator().add(1, 3));
	}

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		assertEquals(-2, new HelloCalculator().subtract(1, 3));

	}

	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		assertEquals(3, new HelloCalculator().multiply(1, 3));

	}

	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		assertEquals(0, new HelloCalculator().divide(1,3));

	}
	

}
