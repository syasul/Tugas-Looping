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
        System.out.println("For");
        
         for (int j = 5; j > 0; j--){
            
            for (int k = 0; k < 5; k++) {
                System.out.print(j < 2 ? "0" : "*");
            }
            System.out.println("0");
        }
         
        System.out.println("");
        System.out.println("While");
         
        int x = 5;
        while(x > 0){
            int y = 0;
            while(y < 5){
                System.out.print(x < 2 ? "0" : "*");
                y++;
            }
            System.out.println("0");
            x--;
        }
        
        System.out.println("");
        System.out.println("Do While");
        int i = 5;
        do{
            System.out.print("");
            int j = 0;
            do
            {
                System.out.print(i < 2 ? "0" : "*");
                j++;
            } while (j < 5);
            System.out.println("0");
            i--;
        }while(i > 0);
        
        
      
    }
}
