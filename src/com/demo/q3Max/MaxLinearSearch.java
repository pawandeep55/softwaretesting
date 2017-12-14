/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.q3Max;

/**
 *
 * @author anonymous
 */
public class MaxLinearSearch {
    
    public int findMax(int arr[]){
        int max=arr[0];
        for(int item : arr){
            if(item>max){
                max=item;
            }
        }
        return max;
    }
    
}
