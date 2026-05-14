package ch09_constructor;

public class C_03_SingleParameterizedConstructor {
	// constructor has same name as class
	public C_03_SingleParameterizedConstructor(String name) {
		System.out.println("Name :" + name);
	}

	public static void main(String[] args) {
		System.out.println("Main method start");
		new C_03_SingleParameterizedConstructor("Frill");
		new C_03_SingleParameterizedConstructor("Dhruv");
	}
}
