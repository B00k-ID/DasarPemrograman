/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//KONVERSI WAKTU DETIK > MENIT DAN JAM!

package tugas;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class KonversiWaktu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //instalisasikan mengambil input user
        
        System.out.println("Masukan Detik : ");
        
        int detik = input.nextInt();
        //menyimpan nilai input ke variable detik
        
        System.out.println("Hasil Konversi : " + detik + " Detik = " + konversiDetikKeMenit(detik) + "Menit");
        System.out.println("Hasil Konversi : " + detik + " Detik = " + konversiDetikKeJam(detik) + "Jam");
    }
    
    public static int konversiDetikKeMenit(int detik){ //method overloadding //Method overloading compile time
        int hasil = 0;
        int menit = detik / 60; //menghitung konversi detik ke menit
        hasil = hasil + menit;
        return hasil; //mengambil nilai
    }
    
    public static int konversiDetikKeJam(int detik){ //method overloading
        int hasil = 0;
        int jam = detik / 3600;
        hasil = hasil + jam;
        return hasil;
    }
}