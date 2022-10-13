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
public class Loop_D {
    public static void main(String []args){
        int i = 5;
        
        while(i > 0){
            System.out.print("0");
            int j = 0;
            while(j < 5){
                System.out.print(i > 4 ? "0" : "*");
                j++;
            }
            System.out.println("");
            i--;
        }
    }
}
