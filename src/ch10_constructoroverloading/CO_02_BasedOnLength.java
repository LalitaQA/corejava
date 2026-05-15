package ch10_constructoroverloading;

public class CO_02_BasedOnLength {
	// constructor with 1 parameter
	CO_02_BasedOnLength(String name) {
		System.out.println("Name : " + name);
	}

	// constructor with 2 parameter
	CO_02_BasedOnLength(String name, int age) {
		System.out.println("Name :" + name);
		System.out.println("Age : " + age);
	}

	public static void main(String[] args) {
		new CO_02_BasedOnLength("Hari", 20);
		// new CO_02_BasedOnLength(5);
		new CO_02_BasedOnLength("Jacob");
	}
}
