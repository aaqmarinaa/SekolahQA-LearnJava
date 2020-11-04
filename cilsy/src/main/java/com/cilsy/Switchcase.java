package com.cilsy;

import java.util.Scanner;

public class Switchcase {
	public static void main (String[] args) {
		System.out.println("======== KELOMPOK - USIA =========");
		System.out.println("==================================");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input usia: ");
		int age = input.nextInt();
		
		String category = new Switchcase().getCategory(age);
		
		switch (category) {
		case "Balita":
			System.out.println("Usia anda "+age+" , Anda termasuk kategori balita dengan range usia 0-5 tahun");
			break;
		case"Kanak-kanak":
			System.out.println("Usia anda "+age+" , Anda termasuk kategori kanak-kanan dengan range usia 6-11 tahun");
			break;
		case "Remaja":
			System.out.println("Usia anda "+age+" , Anda termasuk kategori remaja dengan range usia 12-25 tahun");
			break;
		case"Dewasa":
			System.out.println("Usia anda "+age+" , Anda termasuk kategori Dewasa dengan range usia 26-45 tahun");
			break;
		}
	}

	private String getCategory(int age) {
		if (age >= 0 && age <= 5)
			return "Balita";
		else if (age >= 6 && age <= 11)
			return "Kanak-kanak";
		else if (age >= 12 && age <= 25)
			return "Remaja";
		else if (age >= 26 && age <= 45)
			return "Dewasa";
		else
			return "Invalid";
	}
}
