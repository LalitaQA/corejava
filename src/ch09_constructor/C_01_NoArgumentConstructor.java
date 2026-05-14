package ch09_constructor;

public class C_01_NoArgumentConstructor {
	// no-arg constructor
	public C_01_NoArgumentConstructor() {
		System.out.println("No-arg constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");
		new C_01_NoArgumentConstructor();

		C_01_NoArgumentConstructor arg = new C_01_NoArgumentConstructor();
		System.out.println("Main method ends");
	}
}
