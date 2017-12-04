package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class HelloCalculator08Test {
	@Test
	public void TC00_add() throws Exception {
		assertEquals(4, new HelloCalculator().add(1, 3));
	}
	
	@Test
	public void TC01_subtract() throws Exception {
		assertEquals(-2, new HelloCalculator().subtract(1, 3));
	}
	
	@Test
	public void TC02_multiply() throws Exception {
		assertEquals(3, new HelloCalculator().multiply(1, 3));
	}
	
//	@Test
	@Ignore
	public void TC03_divide() throws Exception {
		assertEquals(0, new HelloCalculator().divide(1, 3));
	}
}
