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
public class BilanganTerbesarDuaBilangan {
    public static void main(String[] args) {
        int x;
        int y;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan nila ke 1 beb : ");
        x = input.nextInt();
        System.out.println("Masukan nila ke 2 beb : ");
        y = input.nextInt();
        
        if (x < y){
            System.out.println(" Nilai " + y + " adalah nilai terbesar ");
        } else {
            System.out.println(" Nilai " + x + " adalah nilai terbesar ");
        }
    }
}
