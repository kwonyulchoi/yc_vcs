package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloCaclulator02Test {
	
		private int input1;
		private int input2;
		private int expected;
		private int actual;
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
		public void add() throws Exception{
			//Arrange
			expected = 4;
			
			//ACT
			actual = calculator.add(input1, input2);
			
			//Assert
			assertEquals(expected,actual);
		}

	

}
