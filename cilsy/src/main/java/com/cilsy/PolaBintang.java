package com.cilsy;

import java.util.Scanner;

public class PolaBintang {
	public static void main(String[] args) {
		int i, j, h;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Berapa Baris : ");
		int row = scan.nextInt();
		
		System.out.println("Soal 1");
		for(i=1; i<=row; i++) {
			for(j=row; j > i; j--) {
				System.out.print(" ");
			}
			for(h=1; h<=i; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Soal 2");
		for(i=1; i<=row; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Soal 3");
        for (i = 1; i <= row; i++) {
            for (j = row; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("Segitiga rata kanan terbalik");
        for (i = 1; i <= row; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (h=row; h >= i; h--) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}