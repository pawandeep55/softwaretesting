/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.q3Max;

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
public class MaxLinearSearchTest {
    MaxLinearSearch maxLinearSearch;
    
    public MaxLinearSearchTest() {
    }
   
    @Before
    public void setUp() {
        maxLinearSearch=new MaxLinearSearch();
    }
    
    

    
    @Test
    public void testMax(){
        System.out.println("testing max");
        int arr[]={23,12,66,76,2,90,1};
        int expected=90;
        int result=maxLinearSearch.findMax(arr);
        assertEquals("error in find max", expected, result);
        System.out.println("max tested successfully");
    }
    
}
