/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pathTesting;

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
public class pathTestingTest {
    
    public pathTestingTest() {
    }

    /**
     * Test of returnInp method, of class pathTesting.
     */
    @Test
    public void testReturnInpFFF() {
        System.out.println("returnInp");
        int x = 50;
        boolean cond1 = false;
        boolean cond2 = false;
        boolean cond3 = false;
        int expResult = 50;
        int result = pathTesting.returnInp(x, cond1, cond2, cond3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testReturnInpTTT(){
        System.out.println("returnInp");
        int x = 50;
        boolean cond1 = true;
        boolean cond2 = true;
        boolean cond3 = true;
        int expResult = 50;
        int result = pathTesting.returnInp(x, cond1, cond2, cond3);
        assertEquals(expResult, result);
    }
     @Test
    public void testReturnInpTFT(){
        System.out.println("returnInp");
        int x = 50;
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;
        int expResult = 51;
        int result = pathTesting.returnInp(x, cond1, cond2, cond3);
        assertEquals(expResult, result);
    }
     @Test
    public void testReturnInpFTF(){
        System.out.println("returnInp");
        int x = 50;
        boolean cond1 = false;
        boolean cond2 = true;
        boolean cond3 = false;
        int expResult = 49;
        int result = pathTesting.returnInp(x, cond1, cond2, cond3);
        assertEquals(expResult, result);
    }
}
