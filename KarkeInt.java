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
public class KarkeInt {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan disini beb: ");
        String res = input.next();
        try {
            int result = Integer.parseInt(res);
            if(result >= 0 && result <= 9) {
                System.out.println("Masukan diterima beb.");
                System.out.println("Angka nya adalah: " + result);
            } else {
                System.out.println("Angka yang anda masukkan harus kurang dari 9 dan lebih dari 0 jadi hasilnya -99 sayangkuu");
            }
        } catch(NumberFormatException e) {
            System.out.println("jangan masukin yg bukan tipe dong beb sakit aih kamu "+e);
        }
    }
}
