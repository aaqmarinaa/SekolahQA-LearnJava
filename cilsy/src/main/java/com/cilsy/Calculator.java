package com.cilsy;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("========Simple Calculator========");
		System.out.println("=================================");
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input 1st Value: ");
	double value1 = input.nextDouble();
	
	System.out.print("Input Operation (+,-,/,*,%): ");
	String operator = input.next();
	
	System.out.print("Input 2nd Value: ");
	double value2 = input.nextDouble();
	
		try {
			double result = new Calculator().getResult(value1, value2, operator);
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
				String formattedResult = decimalFormat.format(result);
				
			System.out.println("The Result from "+value1+" "+operator+" "+value2+" is "+formattedResult);
		}catch(IllegalArgumentException e) {
			System.out.println("The Operation you entered is wrong!");
		}
	}
	
		private double getResult(double value1, double value2, String operator) {
			switch(operator) {
			case"+":
				return value1+value2;
			case"-":
				return value1-value2;
			case"*":
				return value1*value2;
			case"/":
				return value1/value2;
			case"%":
				return value1%value2;
			default:
			throw new IllegalArgumentException();
			}
		
	}
}
