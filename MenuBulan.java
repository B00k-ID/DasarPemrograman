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
public class MenuBulan {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        String[] bulan={"Januari","Februari","Maret","April","Mei","Juni",
                  "Juli","Agustus","September","Oktober","November",
                  "Desember",};
        String[] hari={"31 Hari","28/29 Hari","31 Hari","30 Hari","31 Hari",
                 "30 Hari","31 Hari","31 Hari","30 Hari","31 Hari",
                 "30 Hari","31 Hari"};

  garis();
  System.out.println("       Pilih Menu ya sayangkuu <3 ");
  garis();
  System.out.println("1. Nama Bulan Yang Jumlah Harinya 28/29");
  System.out.println("2. Nama Bulan Yang Jumlah Harinya 30");
  System.out.println("3. Nama Bulan Yang Jumlah Harinya 31");
  System.out.println("4. Keluar Menu");
  System.out.println("");
  garis();

  System.out.print("Kamu Pilih Yang Mana Sayang ? : ");
  int pil=input.nextInt();
  switch(pil){
     case 1 :{
       garis();
       System.out.println("NAMA BULAN YANG JUMLAH HARINYA 28/29\n");
       System.out.println("1. "+bulan[1]+" = "+hari[1]);
       break;
     }
     case 2 :{
       garis();
       System.out.println("NAMA BULAN YANG JUMLAH HARINYA 30\n");
       System.out.println("1. "+bulan[3]+" = "+hari[3]+
                          "\n2. "+bulan[5]+" = "+hari[5]+
                          "\n3. "+bulan[8]+" = "+hari[8]+
                          "\n4. "+bulan[10]+" = "+hari[10]);
       break;
     }
     case 3 :{
       garis();
       System.out.println("NAMA BULAN YANG JUMLAH HARINYA 31\n");
       System.out.println("1. "+bulan[0]+" = "+hari[0]+
                          "\n2. "+bulan[2]+" = "+hari[2]+
                          "\n3. "+bulan[4]+" = "+hari[4]+
                          "\n4. "+bulan[6]+" = "+hari[6]+
                          "\n5. "+bulan[7]+" = "+hari[7]+
                          "\n6. "+bulan[9]+" = "+hari[9]+
                          "\n7. "+bulan[11]+" = "+hari[11]);
       break;
     }
     case 4:{
    System.out.println("Yahh kamu malah keluar :( ");
       System.exit(0);
       break;
     }
       default:System.exit(0);
       
     }
      System.out.println("Loveeee Youu Sayanggg ");
      System.out.println("Makasih sayang.. sampai ketemu lagi sayang <3 ");
    }
    static void garis (){
    System.out.println("========================================");
    }   
}
