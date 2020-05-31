package javaInterviewQuestions;

/*
To check number is palindrome or not
*/
public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=122;//121
		int rev=0;
		
		int actualnum=num;//temp
		
		while(num!=0) {
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		
		System.out.println(rev);
		
		if(actualnum==rev) {
			System.out.println(actualnum+" is a palindrome number");
		} else {
			System.out.println(actualnum+" is not a palindrome number");
		}

	}

}
