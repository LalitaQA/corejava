package ch8_objects;

public class O_08_ObjectForNonStaticVariableAndMethod {
	// non-static variables
	String name;
	double salary;

	// non-static method
	public void details() {
		System.out.println("Employee data");
		System.out.println("name :" + name);
		System.out.println("salary :" + salary);
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");
		O_08_ObjectForNonStaticVariableAndMethod ref = new O_08_ObjectForNonStaticVariableAndMethod();

		// initializing non-static variables
		ref.name = "Jimmy";
		ref.salary = 98000;

		// fetching/print non-static variables and method
		ref.details();
	}
}
