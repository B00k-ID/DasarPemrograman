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
public class NilaiMahasiswa {
    public static void main(String[] args) {
        int nilai;
        char hasil = 0;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan nilai mu beb : ");
        nilai = input.nextInt();
        
        if (nilai >= 80){
            hasil = 'A'; //nilai yg di input lebih dari 80 maka grade A
        } else if (nilai >= 70){  
            hasil = 'B'; //nilai yg di input lebih dari 70 maka grade b
        } else if (nilai >= 55){ 
            hasil = 'C'; //nilai yg di input lebih dari 55 maka grade c
        } else if (nilai >= 40){
            hasil = 'D'; //nilai yg di input lebih dari 40 maka grade d
        } else if (nilai >= 20){
            hasil = 'E'; //nilai yg di input lebih dari 20 maka grade e
        } else  {
            System.out.println("Anda Harus Ngulang Tahun Depan! "); //jika hasil - maka muncul output ini
        }
            System.out.println("Grade kamu adalah tidak ada " + hasil);
    }
    
    
 }

