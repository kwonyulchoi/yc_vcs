package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloCalculatorTest {
	private int input1;
	private int input2;
	private long expected;
	private long actual;
	private HelloCalculator calculator;
	
	@Before
	public void setUp() {
		input1 = 1;
		input2 = 2;
		calculator = new HelloCalculator();		
	}
	
	@After
	public void tearDown() {
		calculator = null;
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		assertEquals(4, new HelloCalculator().add(1, 3));
	}
	
	@Test
	public void add01() {
		//Arrange
		int input1 = 1;
		int input2 = 3;
		int expected = 4;
		HelloCalculator calculator = new HelloCalculator();
		
		//Act
		int actual = calculator.add(input1, input2);
		
		//Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void add02() {
		//Arrange
		expected = 4;
		
		//Act
		actual = calculator.add(input1, input2);
		
		//Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		assertEquals(-2,new HelloCalculator().subtract(1, 3));
	}

	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		assertEquals(3, new HelloCalculator().multiply(1,3));
	}

	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		assertEquals(0, new HelloCalculator().divide(1, 3));
	}

}
