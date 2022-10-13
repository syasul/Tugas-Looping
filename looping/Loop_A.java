package com.mycompany.looping;

/**
 *
 * @author User
 */ 
public class Loop_A {
    public static void main(String []args){
        System.out.println("For");
        for (int c = 5; c >= 1; c--) {
            for (int d = 1; d <= c; d++) {
                System.out.print(d+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("While");
        
//        while
        int c = 5;
        
        while(c >=1 ){
            int d=1;
            while(d<=c){
                System.out.print(d+ " ");
                d++;
            }
            System.out.println("");
            c--;
        }
        
        System.out.println("");
        System.out.println("Do While");
        
//        do while
        int i = 5;
       
        do{
             int j = 1;
            do
            {
                System.out.print(j+" ");
                j++;
            } while (j <= i);
            
            System.out.println("");
            i--;
            
        } while (i >= 1);
        
    
    }
}
