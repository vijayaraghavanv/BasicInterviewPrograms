package javaInterviewQuestions;
/*
Program to find positive or negative numbers
*/

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		
		double number=0;
		if(number<0.0) {
			System.out.println(number+" negative number");
		} else if(number>0.0) {
			System.out.println(number+" positive number");
		} else {
			System.out.println(number+" is zero");
		}
		

	}

}
