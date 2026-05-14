package ch04_decision_Statement;

public class DS_03_Check_Voting_Eligibility {

	public static void main(String[] args) {
		int age = 0;

		final int minage = 18;
		if (age > minage) {
			System.out.println("Person is eligible for voting");
		} else {
			System.out.println("Person is not eligible for voting");
		}
	}
}
