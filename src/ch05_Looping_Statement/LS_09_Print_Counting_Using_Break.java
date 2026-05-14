package ch05_Looping_Statement;

public class LS_09_Print_Counting_Using_Break {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);//print i to skip if condition value
		}
	}
}