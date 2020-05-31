package javaInterviewQuestions;
/*
Largest Among Three Numbers
*/
public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
		int x=350;
		int y=400;
		int z=400;

		if(x>y && x>z) {
			System.out.println("x is greater");
		}else if(y>z) {
			System.out.println("y is greater");
		}else {
			System.out.println("z is greater");
		}
		
		
		if(x>=y) {
			if(x>=z) {
				System.out.println("x is greater");
			} else {
				System.out.println("z is greater");
			}
		} else {
			if(y>=z) {
				System.out.println("y is greater");
			} else {
				System.out.println("z is greater");
			}
		}
	}

}
