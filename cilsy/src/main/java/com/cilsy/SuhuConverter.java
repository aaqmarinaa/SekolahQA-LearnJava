package com.cilsy;

import java.util.Scanner;

public class SuhuConverter {
	public static void main (String[] args) {
		System.out.println("======== KONVERSI SUHU =========");
		System.out.println("==================================");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input suhu: ");
		int suhu = input.nextInt();
		
		String category = new SuhuConverter().getCategory(suhu);
		
		switch (category) {
		case "Beku":
			System.out.println("Suhu yang anda masukkan adalah "+suhu+" , Suhu termasuk BEKU karena di bawah 0 derajat.");
			break;
		case "Dingin":
			System.out.println("Suhu yang anda masukkan adalah "+suhu+" , Suhu termasuk DINGIN karena berada di rentang suhu 1 - 10 derajat.");
			break;
		case "Sejuk":
			System.out.println("Suhu yang anda masukkan adalah "+suhu+" , Suhu termasuk SEJUK karena berada di rentang suhu 11 - 20 derajat.");
			break;
		case "Sedang":
			System.out.println("Suhu yang anda masukkan adalah "+suhu+" , Suhu termasuk SEDANG karena berada di rentang suhu 21 - 25 derajat.");
			break;
		case "Panas":
			System.out.println("Suhu yang anda masukkan adalah "+suhu+" , Suhu termasuk PANAS karena berada di rentang suhu 26 - 99 derajat.");
			break;
		case "Mendidih":
			System.out.println("Suhu yang anda masukkan adalah "+suhu+" , Suhu termasuk MENDIDIH karena melebihi 100 derajat.");
			break;
		}
	}

	private String getCategory(int suhu) {
		if (suhu <= 0)
			return "Beku";
		else if (suhu >= 1 && suhu <= 10)
			return "Dingin";
		else if (suhu >= 11 && suhu <= 20)
			return "Sejuk";
		else if (suhu >= 21 && suhu <= 25)
			return "Sedang";
		else if (suhu >= 26 && suhu <= 99)
			return "Panas";
		else
			return "Mendidih";
	}
}
