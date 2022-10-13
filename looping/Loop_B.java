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
public class Loop_B {
    public static void main(String []args){
        for (int e = 5; e>=1; e--) {
            for (int f = e; f >= 1; f--){
                System.out.print(f+" ");
            }
            System.out.println("");
        } 
    }
}
