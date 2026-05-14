package ch05_Looping_Statement;

public class LS_12_Print_Counting_Using_Continue {

	public static void main(String[] args) {
		for (int i = 10; i <= 20; i++) {
			if (i == 13 || i==15) {
				continue;
			}
			System.out.println(i);
		}
	}
}
