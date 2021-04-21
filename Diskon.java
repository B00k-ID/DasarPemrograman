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
public class Diskon {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
 // mendeklarasika variabel
    int price ; // harga
    int amount; //jumlah
    int discount; // diskon
    int total ; //jumlah*harga
    System.out.print("Masukan Harga barang disini beb : ");
        price=input.nextInt();
    System.out.print("Masukan Jumlah barang disini juga beb : ");
        amount=input.nextInt();
    total=amount*price;
 
    if(total>=100000){
        discount=total*10/100;
    total=total-discount;
        System.out.println("Selamat anda mendapatkan diskon 10% sayang"
    );
    System.out.println ("jadi totalnya : "+total);
    }else {
        System.out.println("Maaf sayang tidak mendapatkan diskon"
    );
        System.out.println ("jadi totalnya : "+total);
    }
    
    }
    
}
