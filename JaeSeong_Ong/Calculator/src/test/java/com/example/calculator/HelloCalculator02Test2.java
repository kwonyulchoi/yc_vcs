package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloCalculator02Test2 {

	
	private int input = 1;
	private int input2 = 3;
	private int expected = 4;
	private int actual ;
	 
	private HelloCalculator calculator;
	 
	@Before
	 public void setup(){
		 
		 input = 1;
		 input2 = 3;
		 
		 calculator = new HelloCalculator();		
	 }
	
	
	@After
	public void tearDown(){
		 calculator = null;		
	 }
	
	@Test
	 public void add() throws Exception {
		
		expected = 4;
		 
		actual = calculator.add(input, input2);
		 
		assertEquals(expected, actual);
		
	 }
	
}
