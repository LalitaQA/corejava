package ch08_objects;

class Mobile {
	// static variable
	static String company = "ABC company";

}

public class O_11_ObjectFoeStaticVariableInAnotherClass {

	public static void main(String[] args) {
		// Access static variable from different class
		System.out.println("Company Name :" + Mobile.company);// use class name as reference

		Mobile ref = new Mobile();
		System.out.println(ref.company);
	}
}
