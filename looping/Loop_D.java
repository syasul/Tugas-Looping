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
        System.out.println("For");
        for (int a = 5; a > 0; a--)
        {
            System.out.print("0");
            for (int b = 0; b < 5; b++)
            {
                System.out.print(a > 4 ? "0" : "*");
            }
            System.out.println("");
        }
        
        
        System.out.println("");
        System.out.println("While");
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
        
        System.out.println("");
        System.out.println("Do While");
        int x = 5;
        do
        {
            System.out.print("0");
            int y = 0;
            do
            {
                System.out.print(x > 4 ? "0" : "*");
                y++;
            } while (y < 5);
            
            System.out.println("");
            x--;
        } while (x > 0);
        
    }
}
