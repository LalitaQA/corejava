package ch05_Looping_Statement;

public class LS_06_Print_Odd_Numbers {

	public static void main(String[] args) {

		for (int n = 25; n <= 50; n++) {
			if (n % 2 == 1) {
				System.out.println(n);
			}
		}
	}
}
