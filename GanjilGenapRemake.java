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
public class GanjilGenapRemake {
    public static void main(String[] args) {
        int angka;
        System.out.println("Masukan Sebuah Integer");
        
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();

        int mod  = angka % 2;

        System.out.println(angka + " % 2 = " + mod);
        
        if(mod == 0) // kalo bisa dibagi 2 maka bilangan genap, sedangkan jika tidak bisa dibagi 2 berarti ganjil
            System.out.println(angka + " bilangan genap");
        else 
            System.out.println(angka + " bilangan ganjil");
    }
    
}
