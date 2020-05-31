package javaInterviewQuestions;

/*
Convert Octal to Decimal number
*/
public class OctalToDecimal {

	public static void main(String[] args) {
		//78 -- 78/8 -->116
				//109 --155
		
		System.out.println(convOctalToDecimal(155));
	}
	
	public static int convOctalToDecimal(int octal) {
		int decimalnumber=0;
		int i=0;
		while(octal!=0) {
			decimalnumber+=(octal%10)*Math.pow(8, i);
			++i;
			octal/=10;
		}
		
		return decimalnumber;
	}

}
