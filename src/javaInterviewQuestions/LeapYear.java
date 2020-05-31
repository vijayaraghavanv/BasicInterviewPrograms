package javaInterviewQuestions;

/*Program to write Leap Year
*/
public class LeapYear {

	public static void main(String[] args) {
		
		//divisible by 4 for all century years ending with 00
		//century is leap year only if it is perfectly divisible by 400
		
		//1900 not leap year bcz not divisible by 400
		//2012 leap year bcz  divisible by 400
		
		int year=2012;
		boolean leap=false;
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				} else {
					leap=false;
				}
			} else {
				leap=true;
			}
		} else {
			leap=false;
		}
		
		if(leap) {
			System.out.println(year+" is leap year");			
		} else {
			System.out.println(year+" is not leap year");
		}
	}
}
