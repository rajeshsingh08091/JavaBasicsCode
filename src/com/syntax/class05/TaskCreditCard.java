package com.syntax.class05;

import java.util.Scanner;

public class TaskCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new scannner(System.in);
		System.out.println("DO you have a credit card? Yes or no");
		String answer = input.next();
		
		if (answer.equals("No")) {
			System.out.println("We will offer you a credit card");
		}else {
			System.out.println("What is the balance on the card");
			int balance =input.nextInt();
			
			if (balance>1000) {
				System.out.println("Pay it off immediately");
			}else {
				System.out.println("You can spend more");
			}
		}
	}

}
