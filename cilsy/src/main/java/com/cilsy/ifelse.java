package com.cilsy;
import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		int nilai;
		String nama;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nama: ");
		nama = scan.nextLine();
		System.out.print("Nilai: ");
		nilai = scan.nextInt();
		
		if(nilai >= 70 && nilai <= 85) {
			System.out.println("Selamat " + nama + ", Anda lulus dengan nilai rata-rata!");
		}
		else if (nilai > 85 ) {
			System.out.println("Selamat " +nama+ ", Anda Lulus!!");
		}
		else {
			System.out.println("Maaf " + nama + ", Anda gagal.");
		}
	}
}