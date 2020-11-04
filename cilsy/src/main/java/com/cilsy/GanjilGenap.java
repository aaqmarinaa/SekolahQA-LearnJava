package com.cilsy;

import java.util.Scanner;

public class GanjilGenap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input bilangan : ");
		int value = input.nextInt();
		
		if (value % 2 > 0) {
			System.out.println(value + " Merupakan bilangan ganjil");
		} else {
			System.out.println(value + "Merupakan bilangan genap");
		}
	}
}
