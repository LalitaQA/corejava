package ch07_methods;

public class M_01_No_Arguments_Method {

	public static void demo() //no formal argument
	{
		System.out.println("No arguments method");
		System.out.println("You can write anything in print statements");
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");
		demo();// calling method by method signature
		System.out.println("Main method ends");
	}
}
