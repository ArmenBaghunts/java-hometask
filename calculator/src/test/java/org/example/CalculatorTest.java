package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.multiply(5, 4), 20.0);
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.add(5, 4), 9.0);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.subtract(5, 6), 1.0);
    }
}



