package javaInterviewQuestions;

/*
Program to check Armstrong number or not
*/
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//153=1*1*1+5*5*5+3*3*3
		//371
		
		int num=154;
		int actualnum=num;
		double result=0;
		
		while(actualnum!=0) {
			int n=actualnum%10;
			result=result+Math.pow(n, 3);
			actualnum=actualnum/10;
		}
		
		if(num==result) {
			System.out.println(num+" is a armstrong number");
		}else {
			System.out.println(num+" is not a armstrong number");
		}

	}

}
