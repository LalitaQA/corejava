package ch08_objects;

public class O_06_ObjectForMultipleNonStaticVariables {
	// non-static variables
	String name;
	double salary;

	public static void main(String[] args) {
		// create an object
		O_06_ObjectForMultipleNonStaticVariables o1 = new O_06_ObjectForMultipleNonStaticVariables();

		// initializing non-static variable
		o1.name = "Eshwar";
		o1.salary = 78000;

		// fetch non-static variables
		System.out.println("Name : " + o1.name);
		System.out.println("Salary :" + o1.salary);

		// create 2nd object
		O_06_ObjectForMultipleNonStaticVariables o2 = new O_06_ObjectForMultipleNonStaticVariables();

		// initializing non-static variable
		o2.name = "Karuna";
		o2.salary = 93000;

		// fetch non-static variables
		System.out.println("Name : " + o2.name);
		System.out.println("Salary :" + o2.salary);
	}
}
