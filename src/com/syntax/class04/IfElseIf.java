package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		
/*
 * declare 2 numbers and verify which one is the largest
 * 
 */

		int num1=20;
		int num2=20;
				
				if(num1>num2) {
					System.out.println(num1+" is the larger than "+num2);
				} else {
					System.out.println(num2+" is the larger than "+num1);
				}
				
		System.out.println("----------------------------------------------------");
		
				int month=10;
				if(month==1) {
					System.out.println("January");
				} else if (month==2) {
					System.out.println("Febuary");
				}else if (month==3) {
					System.out.println("March");
				}else if (month==4) {
					System.out.println("April");
				}else if (month==5) {
					System.out.println("May");
				}else if (month==6) {
					System.out.println("June");
				}else if (month==7) {
					System.out.println("July");
				}else if (month==8) {
					System.out.println("Augest");
				}else if (month==9) {
					System.out.println("September");
				}else if (month==10) {
					System.out.println("October");
				}else if (month==11) {
					System.out.println("November");
				}else if (month==12) {
					System.out.println("December");
				}
				
				System.out.println("------------------------------------------");
				
				boolean mothersDay= true;
						if(mothersDay) {
							System.out.println("Happy Mothers day to all Mothers");
						} else {
							System.out.println("Happy Fathers Day");
						}
				System.out.println("-----------------------------------------");
				
				boolean rain= false;
				if(rain) {
					System.out.println("i will take an umbrella");
				}else {
					System.out.println("no need for umbrella");
				}
				
				
				
				
				
	}

}
