package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloCaclulator01Test {
	
	@Test
	public void add() throws Exception{
		//Arange
		int input1 = 1;
		int input2 = 3;
		int expected = 4;
		HelloCalculator calculator = new HelloCalculator();
		
		int actual = calculator.add(input1, input2);
		
		assertEquals(expected, actual);
		
	}

}
