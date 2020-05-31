package javaInterviewQuestions;

/*
Program to convert binary number to decimal number
*/

public class BinaryNumToDecConv {

	public static void main(String[] args) {
		
		//307 - 1*2^7 0*2^6
		
		long num=100110011;
		int decimal=convertBinaryToDecimal(num);
		System.out.println(decimal);

	}
	
	public static int convertBinaryToDecimal(long num) {
		long remainder;
		int i=0;
		int decimalnumber=0;
		while(num!=0) {
			remainder=num%10;
			num=num/10;
			decimalnumber+=remainder*Math.pow(2, i);
			++i;
		}
		
		return decimalnumber;
	}

}
