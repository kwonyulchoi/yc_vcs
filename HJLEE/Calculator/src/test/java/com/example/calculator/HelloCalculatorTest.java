package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloCalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(4, new HelloCalculator().add(1, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(-2, new HelloCalculator().subtract(1, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals(3, new HelloCalculator().multiply(1, 3));
	}

	@Test
	public void testDivide() {
		assertEquals(0, new HelloCalculator().divide(1, 3));
	}

}
