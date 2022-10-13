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
        System.out.println("For");
        for (int e = 5; e>=1; e--) {
            for (int f = e; f >= 1; f--){
                System.out.print(f+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("While");
        
        int a = 5;
        while(a >= 1){
            int b = a;
            while(b >= 1){
                System.out.print(b+" ");
                b--;
            }
            System.out.println("");
            a--;
        }
        
        System.out.println("");
        System.out.println("Do While");
        
        int x = 5;
        do{
            int y = x;
            do{
                System.out.print(y + " ");
                y++;
            } while (y >= 1);
            
            System.out.println("");
            x--;
        } while (x>=1);
        
        
    }
}
