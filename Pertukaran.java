/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Pertukaran {
    
     public static void main(String[] args) {
     
        int A = 8;
        int B = 5;
        
        System.out.println("--------------------------------");
        System.out.println("Sebelum di swap : ");
        System.out.println(" Nilai A : " + A);
        System.out.println(" Nilai B : " + B);
        
        
        System.out.println("---------------------------------");
        
        int swap = A;
        A = B;
        B = swap;
        
        System.out.println("Sesudah di swap : ");
        System.out.println(" Nilai A : " + A);
        System.out.println( " Nilai B : " + B);
        System.out.println("---------------------------------");
                
       }
    
}