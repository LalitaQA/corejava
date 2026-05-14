package ch01_variables;

public class V_12_Non_Static_Variable {
	// non-static variable
	String name = "jimmy";

	public static void main(String[] args) {
		V_12_Non_Static_Variable na = new V_12_Non_Static_Variable();// create object to fetch non-static variable
		System.out.println(na.name);
	}
}
