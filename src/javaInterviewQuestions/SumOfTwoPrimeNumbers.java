package javaInterviewQuestions;
/*
Check whether a number is sum of two prime numbers
*/
public class SumOfTwoPrimeNumbers {

	public static void main(String[] args) {
		
		//34=31+3 5+29 11+23 17+17
		//11
		//System.out.println(checkPrimeNum(17));
		
		int num=34;
		boolean flag=false;
		
		 for(int i=2;i<=num/2;i++) {
			 
			 if(checkPrimeNum(i)) {
				 
				 if(checkPrimeNum(num-i)) {
					 System.out.println(num+"="+i+"+"+(num-i));
					 flag=true;
				 }
			 }
			 
		 }
		 
		 if(!flag) {
			 System.out.println(num+" can not be expressed as sum of two prime numbers");
		 }
		
		
	}
	
	public static boolean checkPrimeNum(int num) {
		boolean isPrime=true;
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		
		return isPrime;
	}

}
