/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.q2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anonymous
 */
public class CalculatorTest {
    private Calculator cal;
    
    public CalculatorTest() {
    }
    
 
    @Before
    public void setUp() {
        cal=new Calculator();
    }
    
    
    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double num1 = 3.0;
        double num2 = 5.2;
        double expResult = 8.2;
        double result = cal.add(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        System.out.println("checking assertTrue : 10<20");
        assertTrue(cal.first<cal.second);
        
        System.out.println("checking assertFalse : 10>=20");
        assertFalse(cal.first>=cal.second);
        
        System.out.println("assertSame between yoo and yoo");
        assertSame(cal.checkString,"yoos");
        
        System.out.println("assertNull");
        assertNull(cal.checkNullString);
        
        System.out.println("assertNotSame btw yoo and bro");
        assertNotSame(cal.checkString,"bro");
        
        System.out.println("assertNotNull");
        assertNotNull(cal.checkString);
        
    }

    /**
     * Test of minus method, of class Calculator.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        double num1 = 8.2;
        double num2 = 5.2;
        double expResult = 3.0;
        double result = cal.minus(num1, num2);
        assertEquals(expResult, result, 1e-15);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
      double num1 = 3.0;
        double num2 = 2.0;
        double expResult = 6;
        double result = cal.multiply(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
       double num1 = 10.4;
        double num2 = 5.2;
        double expResult = 2.0;
        double result = cal.divide(num1, num2);
        System.out.println("result is "+result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
