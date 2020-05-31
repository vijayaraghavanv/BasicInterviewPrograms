package javaInterviewQuestions;

/*
Program to convert Decimal to Octal number
*/
public class DecimalToOctal {

	public static void main(String[] args) {
		
		//78 -- 78/8 -->116
		//109 --155
		int octal=convDecimalToOctal(109);
		System.out.println(octal);

	}

	public static int convDecimalToOctal(int decimal) {
		int octalnumber=0;
		int i=1;
		int remainder=0;
		
		while(decimal!=0) {
			remainder=decimal%8;
			octalnumber+=remainder*i;
			decimal/=8;//decimal/8
			i*=10;
		}
		return octalnumber;
	}
}
