package ch07_methods;

public class M_08_Print_Int_Of_Char {

	public static int test(char ch) {
		return ch;
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println("ASCII value of b: "+test('b'));
	}
}
