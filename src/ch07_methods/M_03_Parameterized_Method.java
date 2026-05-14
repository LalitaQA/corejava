package ch07_methods;

public class M_03_Parameterized_Method {
	
	//static parameterized method
	static void data(String name) {
		System.out.println("Name : " + name);
	}

	public static void main(String[] args) {
		System.out.println("Main method start");
		data("Lalita");//pass actual value at time of method calling
		System.out.println("Main method ends");
	}
}
