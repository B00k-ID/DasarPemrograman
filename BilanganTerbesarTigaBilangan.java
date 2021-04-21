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
public class BilanganTerbesarTigaBilangan {
    public static void main(String[] args) {
        int pertama,kedua,ketiga, hasil;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Bilangan Pertama : ");
        pertama = input.nextInt();
        
        System.out.println("Masukan Bilangan Kedua : ");
        kedua = input.nextInt();
        
        System.out.println("Masukan Bilangan Ketiga : ");
        ketiga = input.nextInt();
        
        if (pertama > kedua && pertama > ketiga){
            hasil = pertama;
        } else if (kedua > ketiga){
            hasil = kedua;
        } else {
            hasil = ketiga;
        }
        System.out.println("Bilangan Terbesar Adalah : " + hasil);
    }
}
