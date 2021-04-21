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
public class GanjilGenap {
    public static void main(String[] args) {
        int angka;
        System.out.println("Masukan Sebuah Integer");
        
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();
        
        if(angka % 2 == 0) //ikalo bisa dibagi 2 maka bilangan genap, sedangkan jika tidak bisa dibagi 2 berarti ganjil
            System.out.println(angka + " bilangan genap");
        else 
            System.out.println(angka + " bilangan ganjil");
    }
}
