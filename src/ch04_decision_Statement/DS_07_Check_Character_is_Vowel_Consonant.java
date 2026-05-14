package ch04_decision_Statement;

public class DS_07_Check_Character_is_Vowel_Consonant {

	public static void main(String[] args) {
		char ch = 'Z';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a vowel.");
		} else {
			System.out.println(ch + " is a consonant.");
		}
	}
}
