package com.java.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void Test1() {
        Calculator obj = new Calculator();
        int result = obj.add(1,2);
        assertEquals(result, 3);
    }

}