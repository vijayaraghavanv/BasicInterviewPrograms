package javaInterviewQuestions;
/*

Prime number between two intervals
*/
public class PrimeNumberRange {

	public static void main(String[] args) {
		
		//20 to 50
		int low=20;
		int high=50;
		
		while(low<high) {
			
			boolean flag=false;
			
			for(int i=2;i<=low/2;i++) {
				
				if(low%i==0) {
					flag=true;
					break;
				}
				
			}
			
			if(!flag) {
				System.out.println(low+" is a prime number");
			} else {
				System.out.println(low+" is not a prime number");
			}
			
			low++;
			
		}

	}

}
