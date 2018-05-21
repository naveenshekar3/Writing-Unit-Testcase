package com.example.naveen.unittestcase;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator mCalc;

    @Before
    public void setup()
    {
        mCalc=new Calculator();
    }

    @Test
    public void addTest()
    {
        assertEquals(45,mCalc.add(35,10));//impliment the methods from org.junit
    }

    @Test
    public void subtractTest()
    {
        assertEquals(30,mCalc.subtract(40,10));
    }

    @Test
    public void multiplyTest()
    {
        assertEquals(30,mCalc.multiply(6,5));
    }

    @Test
    public void divideTest()
    {
        assertEquals(2,mCalc.divide(4,2));
    }
}
