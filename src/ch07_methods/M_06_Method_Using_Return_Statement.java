package ch07_methods;

public class M_06_Method_Using_Return_Statement {

	public static String demo()//no formal argument method
	{
		return "Welcome";
	}

	public static void main(String[] args) {
		System.out.println("Main method start");
		System.out.println(demo());
		String data = demo();// store the method(demo) data
		System.out.println(data);// print the data
	}
}
