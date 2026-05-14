package ch09_constructor;

public class C_04_MultipleParameterizedConstructor {
	// parameterized constructor
	public C_04_MultipleParameterizedConstructor(String name, double salary) {
		System.out.println("Name : " + name);
		System.out.println("Salaray : " + salary);
	}

	public static void main(String[] args) {
		System.out.println("Main method start");
		new C_04_MultipleParameterizedConstructor("ABC company", 9086688.000);
	}
}
