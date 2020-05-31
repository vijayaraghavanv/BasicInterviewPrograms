package javaInterviewQuestions;
/*
Character is alphabet or not
*/

public class CharacterIsAlphabetOrNot {

	public static void main(String[] args) {
		
		char c='a';
		
		if((c>='a' && c<='z')||(c>='A' && c<='Z')) {
			System.out.println(c+" is an alphabet");
		} else {
			System.out.println(c+" is not an alphabet");
		}

	}

}
