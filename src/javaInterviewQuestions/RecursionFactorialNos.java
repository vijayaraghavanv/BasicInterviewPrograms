package javaInterviewQuestions;

/*

Factorial numbers using recursion
*/
public class RecursionFactorialNos {

	public static void main(String[] args) {
		
		System.out.println(multiplyNum(5));
	

	}
	
	public static int multiplyNum(int num) {
		
		if(num>=1) {
			return num*multiplyNum(num-1);
		}else {
			return 1;
		}
	}

}
