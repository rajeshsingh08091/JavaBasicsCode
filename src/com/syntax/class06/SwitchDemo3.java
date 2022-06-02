package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where are you from?");
		country=scan.nextLine();
		
		switch(country) {
		
		case "Mexico":
			favoriteFood="Tacos";
			break;
		case"Canada":
			favoriteFood="Poutine";
			break;
		case"Turkey":
		    favoriteFood="Lahmacun";
		    break;
		case"Pakistan":
			favoriteFood="Pati chai";
			break;
		case"Egypt":
			favoriteFood="Koshary";
		     break;
		case "USA":
			favoriteFood="Burgers";
			break;
			default:
				favoriteFood="Unknown";
				
				
	}
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);
}}
