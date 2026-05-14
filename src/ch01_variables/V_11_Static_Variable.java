package ch01_variables;

public class V_11_Static_Variable {
	// static variable
	static int count = 10;

	public static void main(String[] args) {
		// accessing static variable directly
		System.out.println("Value of static variable: " + count);

		// modifying static variable
		count = 20;
		System.out.println("Updated value of static variable: " + count);
	}
}
