package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloCalculator01Test {

	@Test
	 public void add() throws Exception {
		 
		 int input = 1;
		 int input2 = 3;
		 int expected = 4;
		 
		 HelloCalculator calculator = new HelloCalculator();
		 
		 int actual = calculator.add(input, input2);
		 
		 assertEquals(expected, actual);
		
	 }
	
}
