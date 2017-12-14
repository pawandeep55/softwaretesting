/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.stackQ4;

/**
 *
 * @author anonymous
 */
public class MyStack {
    private int tos;
    private final int [] stack;

    public MyStack() {
        stack=new int[20];
        tos=-1;
    }
    
    public void push(int ele){
        stack[++tos]=ele;
    }
    
    public int pop(){
        return stack[tos--];
    }
    
    public boolean isEmpty(){
        return -1==tos;
    }

    boolean isFull() {
        return tos>stack.length;
    }
    
}
