package ch08_objects;

public class O_05_Object_For_Non_Static_Variable {
	// non-static variable declaration

	String name;

	public static void main(String[] args) {
		// create an object for class
		O_05_Object_For_Non_Static_Variable o1 = new O_05_Object_For_Non_Static_Variable();

		// non-static variable initialization
		o1.name = "Lalita";
		o1.name = "Java";

		// fetching non-static variable
		System.out.println(o1.name);// it will print last updated value only
	}
}
