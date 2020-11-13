package com.cilsy;

import java.util.*;
class ProfilDiri { 
	  
    public String name;
    public String address;
    public long phone_number;
    public String gender;
    
    ProfilDiri(String name, String address, long phone_number, String gender) 
    { 
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.gender = gender;
    } 
  
  
    public void display() 
    { 
        System.out.println("Name is: " + name);
        System.out.println("Address is: " + address);
        System.out.println("Phone is: " + phone_number);
        System.out.println("Gender is: " + gender);
        System.out.println(); 
    } 
}

public class Profile
{
	public static void main(String[] args) {
		ProfilDiri[] arr; 
		
		arr = new ProfilDiri[2];
        int i=0;
        
        for(i=0; i<2; i++) {
            Scanner scan = new Scanner(System.in);
			System.out.println("Nama : ");
			String name = scan.next();
			
			System.out.println("Alamat : ");
			String address = scan.next();
			
			boolean valid_phone_number = false;
			long phone_number = 0;
			while(!valid_phone_number) {
				System.out.println("No HP : ");
				long phone = scan.nextLong();
				System.out.println();
				if((Long.toString(phone)).length() >= 10 && (Long.toString(phone)).length() <= 12) {
					valid_phone_number = true;
					phone_number = phone;
				} else {
					System.out.println("No HP Minimal 10, Maksimal 12!!");
				}
			}
			
		    boolean valid_gender = false;
		    String gender = "";
		    while(!valid_gender) {
		        System.out.println("Jenis kelamin :");
		        String gnd = scan.next();
		        valid_gender = gnd.equals("L") || gnd.equals("P");
		        if(valid_gender) {
		            gender = gnd;
		        } else {
		            System.out.println("Jenis kelamin harus L / P");
		        }
		    }
			
             arr[i] = new ProfilDiri(name, address, phone_number, gender);
             arr[i].display(); 
        }
	}
}