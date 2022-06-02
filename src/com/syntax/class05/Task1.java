package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter age");
		int age = input.nextInt();
		
		if(age>=18) {
			System.out.println("We will issue a DL for you");
		}else {
			System.out.println("We will Offer you nothing");
		}
	}

}
