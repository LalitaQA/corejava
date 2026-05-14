package ch09_constructor;

public class C_05_ParameterizedConstructorWithNonStaticVariable {
	// non-static variable
	String name;
	double salary;

	// parameterized constructor
	C_05_ParameterizedConstructorWithNonStaticVariable(String ename, double esalary)// ename, esalary are local
																					// variables
	{
		// initializing non-static variables
		name = ename;
		salary = esalary;
	}

	public static void main(String[] args) {
		C_05_ParameterizedConstructorWithNonStaticVariable r = new C_05_ParameterizedConstructorWithNonStaticVariable(
				"Sai", 55000);// initializing value

		// fetching non-static variables
		System.out.println("Name : " + r.name);
		System.out.println("Salary : " + r.salary);
	}
}
