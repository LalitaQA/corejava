package ch09_constructor;

public class C_08_ParameterizedConstructorWithSameNameNonStaticVariable {
	// non-static variables
	String title;
	String author;

	// parameterized constructor
	C_08_ParameterizedConstructorWithSameNameNonStaticVariable(String title, String author) {
		// initilizing non-static variables
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		// creationg object for class
		C_08_ParameterizedConstructorWithSameNameNonStaticVariable ref = new C_08_ParameterizedConstructorWithSameNameNonStaticVariable(
				"3000 stritches", "sudha murthy");
		
		//fetching non-static variables
		System.out.println("Title : "+ref.title + ",Author : "+ref.author);
	}
}
