package ch10_constructoroverloading;

public class CO_01_BasedOnPrameterizedAndNonParameterized {
	// constructor without parameter
	CO_01_BasedOnPrameterizedAndNonParameterized() {
		System.out.println("No arg constructor");
	}

	// constructor with parameter
	CO_01_BasedOnPrameterizedAndNonParameterized(int n) {
		System.out.println("Parameterized constructor");
		System.out.println("n : " + n);
	}

	public static void main(String[] args) {
		new CO_02_BasedOnLength();
		new CO_02_BasedOnLength(5);
	}
}
