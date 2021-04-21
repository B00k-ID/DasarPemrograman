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
public class IndexNilaiMahasiswa {
    
    //indexnilai sayang
    //muahhh <3
    
    public static void main(String[] args) {
        int nilai;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan nilai mu beb : ");
        nilai = input.nextInt();
        
        if (nilai >= 80){
            System.out.println("Grade Nilai A "); //nilai yg di input lebih dari 80 maka grade A
        } else if (nilai >= 70){  
            System.out.println("Grade Nilai B "); //nilai yg di input lebih dari 70 maka grade b
        } else if (nilai >= 55){ 
            System.out.println("Grade Nilai C "); //nilai yg di input lebih dari 55 maka grade c
        } else if (nilai >= 40){
            System.out.println("Grade Nilai D "); //nilai yg di input lebih dari 40 maka grade d
        } else if (nilai >= 20){
            System.out.println("Grade Nilai E "); //nilai yg di input lebih dari 20 maka grade e
        } else {
            System.out.println("Anda Harus Ngulang Tahun Depan! "); //jika hasil - maka muncul output ini
        }
        
        System.out.println("Makasih sayangkuuu , babay kamu <3 ");
    }
    
}
