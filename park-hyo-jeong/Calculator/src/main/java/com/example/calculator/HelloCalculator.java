package com.example.calculator;

/**
 * Created by kwonyul.choi on 2017-07-07.
 */

public class HelloCalculator {
    public int add(int input1, int input2) {
        return input1 + input2;
    }

    public int subtract(int input1, int input2) {
        return input1 - input2;
    }

    public int multiply(int input1, int input2) {
        int sum = 0;

        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input2; j++) {
                sum++;
            }
        }

        return sum;
    }

    public int divide(int input1, int input2) {
        return input1 / input2;
    }
}
