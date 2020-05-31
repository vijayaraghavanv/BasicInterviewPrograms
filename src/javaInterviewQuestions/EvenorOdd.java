package javaInterviewQuestions;

import java.util.Scanner;

/*Program to check even or odd
*/
public class EvenorOdd {

	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		System.out.println("plz enter number");
		int num=reader.nextInt();
		if(num%2==0) {
			System.out.println(num+" is even number");
		} else {
			System.out.println(num+" is odd number");
		}

	}

}
