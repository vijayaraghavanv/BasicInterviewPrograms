package javaInterviewQuestions;

/*
Decimal to binary conversion in java
*/
public class DecimalToBinary {

	public static void main(String[] args) {

		//156 -156/2 --1>0>0
		
		long binary=convDecToBinary(156);
		System.out.println(binary);

	}

	public static long convDecToBinary(int num) {
		int remainder=1;
		int i=1;
		long binarynumber=0;
		
		while(num!=0) {
			remainder=num%2;
			num=num/2;
			binarynumber+=remainder*i;
			i*=10;
		}
		
		return binarynumber;
	}
}
