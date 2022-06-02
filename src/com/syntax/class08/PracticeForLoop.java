package com.syntax.class08;

import java.util.Scanner;

public class PracticeForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int Secret=15;
		System.out.println("Can you guess my number?");
		Secret = input.nextInt();
		while (Secret!=15) {
		System.out.println("Sorry Try Again");
		Secret = input.nextInt();
		}
		System.out.println("Congrats you got it");
	}
	

}
