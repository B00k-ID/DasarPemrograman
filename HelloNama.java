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
public class HelloNama {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        
        System.out.print( " Masukan nama anda : " );
        nama = input.nextLine();
        
        System.out.println( " Nama anda adalah : " + nama );
    }
}
