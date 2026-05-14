package ch07_methods;

public class M_09_Add_100_In_Return_Statement {

	public static int test(int id) {
		return 100 + id;
	}

	public static void main(String[] args) {
		System.out.println(test(2));
		int res = test(5);
		System.out.println(res);
	}
}
