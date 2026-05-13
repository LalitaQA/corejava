package ch9_constructor;

public class C_07_ParameterizedConstructorWithDiffNameNonStaticVariable {
	// non-static variable
	int n = 4;

	C_07_ParameterizedConstructorWithDiffNameNonStaticVariable(int i)// i is local variable
	{
		System.out.println("i : " + i);
		// when there is no local variable with similar to non-static variable
		System.out.println("n : " + n);// this.n -implicitly
		System.out.println("n : " + this.n);// explicitly
	}

	public static void main(String[] args) {
		new C_07_ParameterizedConstructorWithDiffNameNonStaticVariable(10);
	}
}
