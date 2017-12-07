package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloCalculator05Test5 {

	
	private int input = 1;
	private int input2 = 3;
	private int expected = 4;
	private int actual ;
	 
	private HelloCalculator calculator;
	 
	@Before
	 public void setup(){
		 
		 input = 2;
		 input2 = 0;
		 
		 calculator = new HelloCalculator();		
	 }
	
	
	@After
	public void tearDown(){
		 calculator = null;		
	 }
	
	@Test(expected = ArithmeticException.class)
	 public void divide() throws Exception {
		
		expected = 0;
		 
		actual = calculator.divide(input, input2);
		 
		assertEquals("Message : " + input + " + " + input2 + " = " + actual + " , expected -> " + expected  ,
				expected, actual);
		
	 }
	
}
