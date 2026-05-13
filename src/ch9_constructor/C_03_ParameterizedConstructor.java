package ch9_constructor;

public class C_03_ParameterizedConstructor {
	// constructor has same name as class
	public C_03_ParameterizedConstructor(String name) {
		System.out.println("Name :" + name);
	}

	public static void main(String[] args) {
		System.out.println("Main method start");
		new C_03_ParameterizedConstructor("Frill");
		new C_03_ParameterizedConstructor("Dhruv");
	}
}
