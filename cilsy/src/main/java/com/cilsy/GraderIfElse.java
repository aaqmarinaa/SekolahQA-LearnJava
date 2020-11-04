package com.cilsy;

import java.util.Scanner;

public class GraderIfElse {
	public static void main(String[] args) {
		int nilai1;
		int nilai2;
		String grade;
		String nama;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan Nama: ");
		nama = scan.nextLine();
		System.out.print("Inputkan nilai pertama: ");
		nilai1 = scan.nextInt();
		System.out.print("Inputkan nilai kedua: ");
		nilai2 = scan.nextInt();
		
		if (nilai1 >= 90 && nilai2 >= 90) {
			grade = "Selamat anda mendapatkan nilai A";
		} else if (nilai1 >= 80 || nilai2 >= 85 ) {
			grade = "Selamat anda mendapatkan nilai B+";
		} else {
			grade = "Nilai anda adalah E, silahkan ditingkatkan kembali";
		}
		System.out.println(nama + ", " + grade);
	}
}
