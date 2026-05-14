package ch04_decision_Statement;

public class DS_08_Check_Leap_Year {

	public static void main(String[] args) {
		int year = 2024;

		// Logic: (Year divisible by 4 AND not 100) OR (divisible by 400)
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Year is leap year");
		} else {
			System.out.println("Year is not leap year");
		}
	}
}
