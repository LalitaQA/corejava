package ch05_Looping_Statement;

public class LS_11_Print_Counting_Using_Continue {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}
}
