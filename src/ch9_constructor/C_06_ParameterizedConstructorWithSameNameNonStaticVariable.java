package ch9_constructor;

public class C_06_ParameterizedConstructorWithSameNameNonStaticVariable {
	// non-static variables
	int n = 4;

	C_06_ParameterizedConstructorWithSameNameNonStaticVariable() {
		System.out.println("n : " + n);// this.n -implicitly (where there is no local variable)
		System.out.println("n : " + this.n);// explicit
	}

	public static void main(String[] args) {
		new C_06_ParameterizedConstructorWithSameNameNonStaticVariable();
	}
}
