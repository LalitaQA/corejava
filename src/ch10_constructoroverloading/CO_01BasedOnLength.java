package ch10_constructoroverloading;

public class CO_01BasedOnLength {
	// constructor without parameter
	CO_01BasedOnLength() {
		System.out.println("No arg constructor");
	}

	// constructor with parameter
	CO_01BasedOnLength(int n) {
		System.out.println("Parameterized constructor");
		System.out.println("n : " + n);
	}

	public static void main(String[] args) {
		new CO_01BasedOnLength();
		new CO_01BasedOnLength(5);
	}
}
