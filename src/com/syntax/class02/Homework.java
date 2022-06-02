package com.syntax.class02;

public class Homework {

	public static void main(String[] args) {
		
		float n1=10.01f;
		float n2=20.02f;
		float sum,sub,multi,div;
		
		sum= n1+n2;
		sub= n1-n2;
	  multi= n1*n2; 
	    div= n1/n2;
	    
	    System.out.println("The sum of 2 numbers "+n1+" and "+n2+" is equal to "+sum);
	    System.out.println("The sub of 2 numbers "+n1+" and "+n2+" is equal to "+sub);
	    System.out.println("The multi of 2 numbers "+n1+" and "+n2+" is equal to "+multi);
		System.out.println("The div of 2 numbers "+n1+" and "+n2+" is equal to "+div);
		
		float n3=3.9f;
		float square=n3*n3;
		System.out.println("The squareof the "+n3+" is "+square);
		
		int width, height;
		width=5;
		height=8;
		
		int area= width*height;
		int perimeter=(width+height)*2;
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
		
		
	   

	}

}
