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
public class NamaBulanAngka {
    
    public static void main(String[] args) {
        int angka = 12;
        String nama;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka magic kamu beb : ");
        angka = input.nextInt();
        
        if (angka == 1){
            nama = " Januari ";
            System.out.print("Bulan Januari ")
                    ;
        } else if (angka == 2){
            nama = " Febuari ";
            System.out.print("Bulan Febuary ");
            
        } else if (angka == 3){
            nama = " Maret ";
            System.out.print("Bulan Maret ");
            
        } else if (angka == 4){
            nama = " April ";
            System.out.print("Bulan April ");
            
        } else if (angka == 5) {
            nama = " Mei ";
            System.out.print("Bulan Mei ");
            
        } else if  (angka == 6) {
            nama = " Juni ";
            System.out.print("Bulan Juni ");
            
        } else if (angka == 7) {
            nama = " Juli ";
            System.out.print("Bulan Juli ");
            
        } else if (angka == 8) {
            nama = " Agustus ";
            System.out.print("Bulan Agustus ");
        } else if (angka == 9) {
            nama = " September ";
            System.out.print("Bulan September ");
        } else if (angka == 10) {
            nama = " Oktober ";
            System.out.print("Bulan Oktober ");
        } else if (angka == 11) {
            nama = " November ";
            System.out.print("Bulan November ");
        } else if (angka == 12) {
            nama = " Desember ";
            System.out.print("Bulan Desember ");
        } else {
            System.out.print("Kode Salah! ");
        }
        
        System.out.println("Makasih sayangkuu :* ");
    }
    
}
