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
public class Rere {
    public static void main(String[] args) {
        int a;
	float b, c;
        Scanner input=new Scanner(System.in);
        
        System.out.println("masukan angka a : ");
        a = input.nextInt();
	 System.out.println("masukan angka b : ");
	b = input.nextInt();
		if (a > 5)
			c = a * b + 3;
		else
			c = a * (b + 3);
			
		      System.out.println(a * b + 3);
		
	}
    }

