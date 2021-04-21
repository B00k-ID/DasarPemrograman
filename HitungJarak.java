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
public class HitungJarak {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float S,V,T;
        System.out.println("V="); V=sc.nextFloat();
        System.out.println("T="); T=sc.nextFloat();
        S=V*T;
        System.out.println("jarak = "+S);
    }
}
