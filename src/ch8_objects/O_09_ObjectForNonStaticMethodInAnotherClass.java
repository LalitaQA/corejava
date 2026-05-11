package ch8_objects;

class Employee {
	// non-static method
	public void data() {
		System.out.println("Employee details");

	}
}

public class O_09_ObjectForNonStaticMethodInAnotherClass {

	public static void main(String[] args) {
		// create an object
		Employee ref = new Employee();
		ref.data();
	}
}
