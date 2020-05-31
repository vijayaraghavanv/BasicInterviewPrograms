package javaInterviewQuestions;
/*
Program to reverse a number
*/
public class ReverseANumber {

	public static void main(String[] args) {
		
		int num=8769;
		int rev=0;
		
		while(num!=0){
			int n=num%10;
			rev=rev*10+n;//43
			num=num/10;
		}
		
		System.out.println("reverse an number: "+rev);

	}

}
