package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		int dose=2;
		if (vaccine) {
			System.out.println("Let me check how many doses you have");
			if (dose==1) {
				System.out.println("you need 1 more shot");
			}
		}else {
			System.out.println("i did not get the shot");
		}
				System.out.println("--------------------------------------------");
				
				String month="May";
				int day=8;
				
				if(month.equals("May")); {
					System.out.println("Let me check what is todays date");
					if (day==8) {
						System.out.println("Today is Mothers Day");
					}
				}else if (month.equals("June")) {
					System.out.println("It is Fathers Day");
				}

		
	}

}
