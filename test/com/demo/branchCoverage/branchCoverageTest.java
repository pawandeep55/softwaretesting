/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.branchCoverage;

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
public class branchCoverageTest {
    
    public branchCoverageTest() {
    }
    
  
    /**
     * Test of branchDemo method, of class branchCoverage.
     */
    @Test
    public void testBranchDemo() {
        System.out.println("branchDemo");
        int x = 0;
        boolean cond1 = false;
        boolean cond2 = false;
        boolean cond3 = false;
        int expResult = 1;
        int result = branchCoverage.branchDemo(x, cond1, cond2, cond3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testBranchDemo2(){
        System.out.println("branch demo 2");
        int x=0;
        boolean cond1=true;
        boolean cond2=true;
        boolean cond3=true;
        int expResult=0;
        int result=branchCoverage.branchDemo(x, cond1, cond2, cond3);
        assertEquals(expResult, result);
        
    }
    
}
