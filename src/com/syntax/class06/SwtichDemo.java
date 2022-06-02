package com.syntax.class06;

public class SwtichDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char choice='N';
		String meaning;
		
		switch(choice) {
		
		case 'Y':
			meaning="Yes";
			break;
		case 'M':
			meaning="Maybe";
			break;
		case 'N':
			meaning="No";
			break;
			default:
				meaning="Unknown";
				
				
		}
	}

}
