/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.q1;

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
public class DivideTest {
    private Divide d;
    
    public DivideTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("before class called");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("after class called");
    }
    
    @Before
    public void setUp() {
        System.out.println("@Before called");
        d=new Divide();
    }
    
    @After
    public void tearDown() {
        System.out.println("@After called");
    }

    /**
     * Test of divide method, of class Divide.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Double num = 6.0;
        Double den = 3.0;
       
        Double expResult = 2.0;
        Double result = d.divide(num, den);
        assertEquals(expResult, result,1e-15);
        System.out.println("test is completed");
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testDivide2(){
        System.out.println("dividing 2");
        assertEquals("testing divide",(45.0/5.0),9.0,1e-15);
                System.out.println("test is completed");

    }
    
}
