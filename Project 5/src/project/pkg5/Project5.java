/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg5;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Project5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner reader = new Scanner(System.in); 
     System.out.println("Enter a Whole Number: ");
         int num = reader.nextInt(); 
         int i = num;
         do{
             System.out.println(i);
             i--;
        } while( i > 0);
   
         
         }
    
}
