package javaInterviewQuestions;

/*
Convert binary to octal conversion
*/
public class BinaryToOctal {

	public static void main(String[] args) {
		long num=10011100; //234
		int decimal=convertBinaryToDecimal(num);
		int octal=convDecimalToOctal(decimal);
		System.out.println(octal);
	}

	
	public static int convertBinaryToDecimal(long num) {
		long remainder;
		int i=0;
		int decimalnumber=0;
		while(num!=0) {
			remainder=num%10;
			num=num/10;
			decimalnumber+=remainder*Math.pow(2, i);
			++i;
		}
		
		return decimalnumber;
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
