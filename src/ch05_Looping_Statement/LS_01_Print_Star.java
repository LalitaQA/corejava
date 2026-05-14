package ch05_Looping_Statement;

public class LS_01_Print_Star {

	public static void main(String[] args) {
		int count = 1;// initialization

		while (count <= 4) {
			System.out.println("*");
			count++;//if updation is not here then loop iterate infinite time
		}
	}
}
