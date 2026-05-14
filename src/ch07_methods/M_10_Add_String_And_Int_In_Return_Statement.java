package ch07_methods;

public class M_10_Add_String_And_Int_In_Return_Statement {

	public static String test(String name, int id) {
		return "name :" + name + ",id :" + id;
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println(test("Jesu", 101));
	}
}
