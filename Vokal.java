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
public class Vokal {
    
    public static void main (String [] args){
        char huruf;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Masukan Huruf : ");
        
        huruf = input.next().charAt(0);
        
        if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o'){
            System.out.println( huruf + " : Termasuk Huruf Vokal ");
        }
        else {
            System.out.println( huruf + " : Termasuk huruf konsonan ");
        }
    }
    
}