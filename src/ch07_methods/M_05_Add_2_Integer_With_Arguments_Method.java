package ch07_methods;

public class M_05_Add_2_Integer_With_Arguments_Method {

	public static void add(int a, int b) {
		System.out.println("Sum : " + (a + b));
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");
		add(45, 10);
		add(10, 00);
		System.out.println("Main method ends");
	}
}
