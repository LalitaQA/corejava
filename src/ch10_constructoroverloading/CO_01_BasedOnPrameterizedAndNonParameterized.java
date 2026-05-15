package ch10_constructoroverloading;

public class CO_01_BasedOnPrameterizedAndNonParameterized {
	//overloading constructor based on length
	// constructor without 0 parameter
	CO_01_BasedOnPrameterizedAndNonParameterized() {
		System.out.println("No arg constructor");
	}

	// constructor with 1 parameter
	CO_01_BasedOnPrameterizedAndNonParameterized(int n) {
		System.out.println("Parameterized constructor");
		System.out.println("n : " + n);
	}

	public static void main(String[] args) {
		new CO_01_BasedOnPrameterizedAndNonParameterized();
		new CO_01_BasedOnPrameterizedAndNonParameterized(5);
	}
}
