package javaInterviewQuestions;

/*
Sum of natural numbers using recursion
*/
public class RecursionSumNaturalNos {

	public static void main(String[] args) {
		
		int num=5;//15=5+4+3+2+1
		int sum=addnum(num);
		System.out.println("sum is ::"+sum);

	}
	
	public static int addnum(int num) {
		
		if(num!=0) {
			return num+addnum(num-1);
		}else {
			return num;
		}
	}

}
