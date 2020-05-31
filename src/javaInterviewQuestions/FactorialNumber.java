package javaInterviewQuestions;
/*
Factorial of an number
*/
public class FactorialNumber {

	public static void main(String[] args) {
		
		//!5=5*4*3*2*1=120
		//!0=1
		int num=0;
		getFact(num);
		/*int fact=1;
	
	for(int i=1;i<=num;i++){
		fact=fact*i;
	}
	
	System.out.println("factorial of "+num+" is : "+fact);
*/
	}
		
	
	public static void getFact(int num) {
		int fact=1;
		
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		
		System.out.println("factorial of "+num+" is : "+fact);
	}
	
	

}
