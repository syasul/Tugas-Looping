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
public class Loop_F {
    public static void main(String []args){
        int i = 5;
        do{
            System.out.println("");
            int j = 0;
            do
            {
                System.out.print(j < 2 ? "0" : "*");
                j++;
            } while (j < 5);
            System.out.println("0");
            i--;
        }while(i > 0);
        
        
        
//        for (int j = 5; j > 0; j--){
//            System.out.print("");
//            for (int k = 0; k < 5; k++) {
//                System.out.print(j < 2 ? "0" : "*");
//            }
//            System.out.println("0");
//            
//
//        } 
    }
}
