package com.cilsy;

import java.util.Scanner;

public class DataDiri {
	public static void main(String[] args) {
		String[] data = new String[10];
		int i=0;
		for(i=0; i<2; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Nama : ");
			String nama = scan.next();
			data[0] = nama;
			System.out.println("Alamat : ");
			String alamat = scan.next();
			data[1] = alamat;
			System.out.println("No HP : ");
			String noHp = scan.next();
			data[2] = noHp;
			System.out.println("Jenis Kelamin : ");
			String jenisKelamin = scan.next();
			data[3] = jenisKelamin;
			System.out.println("Nama saya " + data[0]);
			System.out.println("Alamat saya di " + data[1]);
			System.out.println("No HP saya " + data[2]);
			System.out.println("Jenis Kelamin saya " + data[3]);
		}
	}
}

//Array list
//panjang no hp 10-12
//jenis kelamin hanya laki2
//buat kedalam satu class untuk datanya