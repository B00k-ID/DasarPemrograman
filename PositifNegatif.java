/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PositifNegatif {
    
    public static void main (String [] args){
        
        int bilangan;
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" Masukan Bilangan : ");
        bilangan = sc.nextInt();
        
        if(bilangan < 0) {
            System.out.println(" bilangan " + bilangan + " adalah bilangan negatif "); //jika bilangan kurang dari nol maka negatif
        }
        if (bilangan > 0){
            System.out.println(" bilangan " + bilangan + " adalah bilangan positif "); //jika bilangan lebih dari nol maka positif
        }
        if(bilangan == 0){
            System.out.println(" bilangan " + bilangan + " bukan negatif ataupun positif ");
        }
    }    
}