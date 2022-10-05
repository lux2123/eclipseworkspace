package Assignments;

public class CheckVowelAndConsonant {
	
	protected static void checkAlphabetVowelOrConsonant(char ch) {
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A'|| ch=='E') {
			System.out.println("Given alphabet is vowel");
		}
		else
		{
			System.out.println("Given alphabet is consonant");
		}
	}

	public static void main(String[] args) {
		CheckVowelAndConsonant.checkAlphabetVowelOrConsonant('E');

	}

}
