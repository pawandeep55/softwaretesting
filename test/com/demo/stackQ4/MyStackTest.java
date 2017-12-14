/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.stackQ4;

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
public class MyStackTest {
    MyStack ms;
    
    public MyStackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         ms=new MyStack();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class MyStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
       if(!ms.isFull()){
           ms.push(2);
           System.out.println("pushed 2");
       }
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of pop method, of class MyStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        if(!ms.isEmpty()){
            int pop=ms.pop();
            assertEquals(2, pop);

        }
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsEmpty(){
        System.out.println("isEmpty");
        assertEquals(ms.isEmpty(),false);
    }
    @Test
    public void testIsFull(){
        System.out.println("isfull");
        assertEquals(ms.isFull(), false);
    }
    
}
