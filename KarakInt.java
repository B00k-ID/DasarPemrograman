/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author ibnu
 */
public class KarakInt {
    
    public static void main(String[] args) {
        
        Scanner beb = new Scanner (System.in);
        
        char a;
        int b;
        
        System.out.println("Konversi");
        System.out.println("--------------------");
        System.out.println("Masukan Karakter 0 - 9 : "); a = beb.next().charAt(0);
        
        switch(a) {
            case '0':b=0; break;
            case '1':b=1; break;
            case '2':b=2; break;
            case '3':b=3; break;
            case '4':b=4; break;
            case '5':b=5; break;
            case '6':b=6; break;
            case '7':b=7; break;
            case '8':b=8; break;
            case '9':b=9; break;
            default: b= -99; break;
            
        }
        System.out.println("Nilai Integer" + b);
        System.out.println("----------------------");
        System.out.println("Program selesai");
    }
    
}
