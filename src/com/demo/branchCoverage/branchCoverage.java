/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.branchCoverage;

/**
 *
 * @author anonymous
 */
public class branchCoverage {
    public static int branchDemo(int x,boolean cond1,boolean cond2,boolean cond3){
        if(cond1)
            x++;
        else
            x+=3;
        if(cond2)
            x--;
        else
            x-=2;
        if(cond3)
            x=x;
        return x;
    }
}
