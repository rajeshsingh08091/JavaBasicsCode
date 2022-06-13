package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {

void printHello() {
	System.out.println("How are you guys?");
}
boolean returnTrue() {
	return true;
}

int returnInt() {
	return 10;
}
public static void main(String[] args) {
	MethodsDemo md=new MethodsDemo();
	md.printHello();
	
	boolean xs=md.returnTrue();
	
	int num=md.returnInt();
	System.out.println(num);
	
	Scanner scanner=new Scanner(System.in);
	scanner.nextInt();
 }
}
