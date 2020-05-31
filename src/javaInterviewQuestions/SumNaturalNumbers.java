package javaInterviewQuestions;

/*Sum of natural numbers
*/
public class SumNaturalNumbers {

	public static void main(String[] args) {
		
		int num=100;
		int sum = 0,sum1=0;
		
		//1+2+3..+100=> 5050
		for (int i = 0; i <=100; i++) {
			sum=sum+i;
		}
		
		System.out.println("sum is::"+sum);
		System.out.println("-----------");
		
		int k=1;
		while(k<=num) {
			sum1=sum1+k;
			k++;
		}
		System.out.println("sum is::"+sum1);
	}

}
