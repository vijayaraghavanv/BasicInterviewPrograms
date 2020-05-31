package javaInterviewQuestions;

import java.util.Scanner;

/*
Java Program to Print an Integer (Entered by the User)
*/

public class PrintAnInteger {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader =new Scanner(System.in);
		
		System.out.println("plz enter number");
		
		int num=reader.nextInt();
		
		System.out.println("you entered::"+num);
		
	}

}
