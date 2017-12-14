/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.q2;

/**
 *
 * @author anonymous
 */
public class Calculator {
    
    int first,second;
    String checkString="yoo";
    String checkNullString=null;

    public Calculator() {
        first=10;
        second=20;
    }
    
    public double add(double num1,double num2) { return num1+num2; }
    public double minus(double num1,double num2) { return num1-num2; }
    public double multiply(double num1,double num2) { return num1*num2; }
    public double divide(double num1,double num2) { return num1/num2; }
    
    
    
}
