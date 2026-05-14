package ch05_Looping_Statement;

public class LS_05_Print_Even_Numbers {

	public static void main(String[] args) {
		int n = 1;

		while (n <= 10) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
			n++;
		}
	}
}
