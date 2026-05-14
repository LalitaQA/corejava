package ch07_methods;

public class M_02_Add_2_Integers {

	public static void main(String[] args) {
		System.out.println("Main method starts");
		add();
		System.out.println("Main method ends");
	}
	
	//no arguments static method
	static void add() {
		int a = 8, b = 10;
		System.out.println("Result : " + (a + b));
	}
}
