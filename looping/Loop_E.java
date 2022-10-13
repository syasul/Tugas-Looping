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
public class Loop_E {
    public static void main(String []args){
        System.out.println("For");
        for (int s = 0; s < 5; s++){
            for (int t = 0; t < 5; t++){
                System.out.print(s == t ? "0" : "*");
            }
            System.out.println("");
            
        }
        System.out.println("");
        System.out.println("While");
        
        int i = 1;
        while(i <= 5){
            int j=1;
            while(j <= 5){
                System.out.print(i == j ? "0" : "*");
                j++;
            }
            System.out.println("");
            i++;
        }
        
        System.out.println("");
        System.out.println("Do While");
        
        int x = 1;
        do
        {   
            int y = 1;
            do
            {
                System.out.print(x == y ? "0" : "*");
                y++;
            } while (y<=5);
            
            System.out.println("");
            x++;
        } while (x <= 5);
        
    }
}
