package ch10_constructoroverloading;

public class CO_02_BasedOnLength {
	// constructor without parameter
	CO_02_BasedOnLength() {
		System.out.println("No arg constructor");
	}

	// constructor with parameter
	CO_02_BasedOnLength(int n) {
		System.out.println("Parameterized constructor");
		System.out.println("n : " + n);
	}

	public static void main(String[] args) {
		new CO_02_BasedOnLength();
		new CO_02_BasedOnLength(5);
	}
}
