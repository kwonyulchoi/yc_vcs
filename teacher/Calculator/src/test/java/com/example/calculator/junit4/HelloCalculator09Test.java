package com.example.calculator.junit4;

import org.junit.Test;

import com.example.calculator.HelloCalculator;

import static org.junit.Assert.assertEquals;



public class HelloCalculator09Test {
    public static class TestCalculator extends HelloCalculator {
        public int counter = 0;

        @Override
        public int add(int input1, int input2) {
            counter++;
            return super.add(input1, input2);
        }

        public int subtract(int input1, int input2) {
            counter++;
            return super.subtract(input1, input2);
        }

        public int multiply(int input1, int input2) {
            counter++;
            return super.multiply(input1, input2);
        }

        public int divide(int input1, int input2) {
            counter++;
            return super.divide(input1, input2);
        }
    }

    @Test
    public void countingCalculation() throws Exception {
        TestCalculator calculator = new TestCalculator();

        assertEquals(4, calculator.add(1, 3));
        assertEquals(4, calculator.add(1, 3));
        assertEquals(4, calculator.add(1, 3));

        assertEquals(3, calculator.counter);
    }
}