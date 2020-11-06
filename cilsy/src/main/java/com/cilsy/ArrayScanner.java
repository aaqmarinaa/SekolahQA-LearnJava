package com.cilsy;
import java.util.Scanner;

public class ArrayScanner {
	public static void main (String[] args) {
//		String[][] meja = new String[2][3];
//		Scanner scan = new Scanner(System.in);
//		
//		for(int bar = 0; bar <meja.length; bar++) {
//			for(int kol = 0; kol < meja[bar].length; kol++) {
//				System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
//				meja[bar][kol] = scan.nextLine();				
//			}
//		}
//		
//		System.out.println("-----------------------");
//		for(int bar = 0; bar < meja.length; bar++) {
//			
//		}
		String[][] name = {
				{"Citra", "Larasati"},
				{"Nino", "Yudha"}
		};
		
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j < name.length; j++) {
				System.out.println("Baris ke-" + i + " Kolom ke-" + j + " Terisi " + name[i][j]);
			}
		}
	}
}
