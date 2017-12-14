/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.Triangle;

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
public class TriangleTest {
    
    public TriangleTest() {
    }
    
   Triangle t;
    
    @Before
    public void setUp() {
        t=new Triangle(100, 100, 1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isScalene method, of class Triangle.
     */
    @Test
    public void testIsScalene() {
        System.out.println("isScalene");
        boolean expResult = false;
        boolean result = t.isScalene();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isEquilateral method, of class Triangle.
     */
    @Test
    public void testIsEquilateral() {
        System.out.println("isEquilateral");
        boolean expResult = false;
        boolean result = t.isEquilateral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isIsosceles method, of class Triangle.
     */
    @Test
    public void testIsIsosceles() {
        System.out.println("isIsosceles");
        boolean expResult = true;
        boolean result = t.isIsosceles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isTriangle method, of class Triangle.
     */
    @Test
    public void testIsTriangle() {
        System.out.println("isTriangle");
        boolean expResult = false;
        boolean result = t.isTriangle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isNominal method, of class Triangle.
     */
    @Test
    public void testIsNominal_int() {
        System.out.println("isNominal");
        int x = 0;
        boolean expResult = false;
        boolean result = t.isNominal(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isNominal method, of class Triangle.
     */
    @Test
    public void testIsNominal_0args() {
        System.out.println("isNominal");
        boolean expResult = false;
        boolean result = t.isNominal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isMax method, of class Triangle.
     */
    @Test
    public void testIsMax() {
        System.out.println("isMax");
        boolean expResult = true;
        boolean result = t.isMax();
        assertEquals(expResult, result);
        assertTrue("error in max boundary",result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
