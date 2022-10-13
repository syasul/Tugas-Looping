/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.looping;

/**
 *
 * @author User
 */ 
public class Loop_A {
    public static void main(String []args){
        for (int c = 5; c >= 1; c--) {
            for (int d = 1; d <= c; d++) {
                System.out.print(d+" ");
            }
            System.out.println("");
        }
    
    }
}
