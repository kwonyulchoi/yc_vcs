package com.example.calculator.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.example.calculator.HelloCalculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class HelloCalculator04Test {
    private int input1;
    private int input2;
    private long expected;
    private long actual;
    private HelloCalculator calculator;

    @Before
    public void setUp() {
        calculator = new HelloCalculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateParams() {
        List<Object[]> params = new ArrayList<Object[]>();

        params.add(new Object[]{1, 2, 3});
        params.add(new Object[]{10, 20, 30});
        params.add(new Object[]{100, 200, 300});
        params.add(new Object[]{1000, 2000, 3000});

        return params;
    }

    public HelloCalculator04Test(int input1, int input2, long expected) {
        System.out.print("");
        //Arrange
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @Test
    public void add() throws Exception {
        //Act
        actual = calculator.add(input1, input2);

        //Assert
        assertEquals(expected, actual);
    }
}