package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Monday and Friday---> No Class
		 * Tuesday and Wednesday----> Manual Testing
		 * Thursday----------------->Review
		 * Saturday and Sunday------> Java
		 */
		
		String day="Monday";
		
		if(day.equals("Monday")|| day.equals("Friday")) {
			System.out.println("I have no Class");
			
		}else if (day.equals("Tuesday") && day.equals("Wednesday")) {
			System.out.println("I have Manual Testing Class");
			
		}else if (day.equals("Thursday")) {
             System.out.println("I have No Class");
             
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java Class");
		}
}}
