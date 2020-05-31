package javaInterviewQuestions;

/*
Program to display number of digits as an integer
*/

public class NumberofDigits {

	public static void main(String[] args) {
		
		//12345 =5
		//12=2
	// long num=1234543210123l;
		long num=01;
	 int count=0;
	 while(num!=0) {
		 num=num/10;
		 ++count;
	 }

	 System.out.println("number of digits:"+count);
	}

}
