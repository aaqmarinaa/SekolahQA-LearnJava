package com.cilsy;

public class Array {
	public static void main (String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		String[] empty = {};
		if(empty.length == 0) {
			System.out.println("empty");
		}
		
		String[] emptyCars = null;
		if(emptyCars == null) {
			System.out.println();
		}
		
		System.out.println(cars[1]);
		
		if(cars[1] == "BMW") {
			System.out.println("Benar!!!!");
		}
		
		System.out.println(cars.length);
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println("Indeks ke-" +i+ ": " + cars[i]);
			System.out.println(cars[i]);
			
			if(cars[i] == "") {
				System.out.println("Data kosong");
			}
		}
	}
}
