package javaInterviewQuestions;
/*
Program to generate an multiplication table
*/
public class MultiplicationTable {

	public static void main(String[] args) {
	
		//2x1=2
		//2x2=4
	
		int num=13;
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}

	}

}
