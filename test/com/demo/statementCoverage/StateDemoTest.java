/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.statementCoverage;

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
public class StateDemoTest {

    public StateDemoTest() {
    }
    StateDemo sd;

    @Before
    public void setUp() {
        sd = new StateDemo();
    }

    /**
     * Test of stateDemoReturn method, of class StateDemo.
     */
    @Test
    public void testStateDemoReturn() {
        System.out.println("stateDemoReturn");
        int x = 0;
        boolean cond1 = true;
        boolean cond2 = true;
        boolean cond3 = true;
        int expResult = 0;
        int result = sd.stateDemoReturn(x, cond1, cond2, cond3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
