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
        for (int s = 0; s < 5; s++){
            for (int t = 0; t < 5; t++){
                System.out.print(s == t ? "0" : "*");
            }
            System.out.println("");
            
        }
    }
}
