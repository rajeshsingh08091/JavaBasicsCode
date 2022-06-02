package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Tom";
		String lastName="Parker";
        String grade="A";
        String city="Atlanta";
        String state= "Georgia";
        String phoneNumber="123456789";
       
        
        System.out.println("My name is "+name+" and my last name is "+lastName);
        System.out.println("I am a "+grade+" student");
        System.out.println("I Live in "+city+","+state);
        System.out.println("And my phone number is "+phoneNumber);
        
        city="Miami";
        state="Florida";
        phoneNumber="9876543211";
        grade="F";
        
        System.out.println("My name is "+name+" and I Moved to "+city+" and the new state "+state);
        System.out.println("My new Phone number is"+phoneNumber);
      
	}

}
