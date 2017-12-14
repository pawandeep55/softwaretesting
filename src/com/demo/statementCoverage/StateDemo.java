/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.statementCoverage;

/**
 *
 * @author anonymous
 */
public class StateDemo {
    
    public static int stateDemoReturn(int x,boolean cond1,boolean cond2,boolean cond3){
        if(cond1){
            x++;
            System.out.println("statement 1 executed");
        }
        if(cond2){
            x--;
            System.out.println("statement 2 executed");
        }
        if(cond3){
            x=x;
            System.out.println("statement 3 executed");
        }
        return x;
    }
    
}
