package ch8_objects;

public class O_08_ObjectForNonStaticVariableAndMethod {
	//non-static variables
	String name;
	double salary;
	
	//non-static method
	public void details()
	{
		System.out.println("Employee data");
		System.out.println("name :" +name);
		System.out.println("salary :" +salary);
	}

	public static void main(String[] args) {
		
	}

}
