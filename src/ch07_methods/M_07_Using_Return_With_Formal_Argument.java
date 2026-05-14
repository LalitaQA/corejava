package ch07_methods;

public class M_07_Using_Return_With_Formal_Argument {

	public static String sample(float percentage) {
		return "Percentage is :" + percentage;
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println(sample(87.4f));// print
		String result = sample(98.54f);// store
		System.out.println(result);
		System.out.println("Main ends");
	}
}
