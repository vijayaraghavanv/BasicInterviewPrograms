package javaInterviewQuestions;
/*
Program to swap two numbers
*/
public class SwapNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
//		System.out.println("before swapping:");
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		System.out.println("after swapping:");
//		
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("a="+a);
//		System.out.println("b="+b);
		
		//without temporary variable
		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("after swapping:");
	/*	b=a+b;//30
		a=b-a;//20
		b=b-a;//10*/
		a=a-b;//-10
		b=a+b;//10
		a=b-a;//20
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
	}

}
