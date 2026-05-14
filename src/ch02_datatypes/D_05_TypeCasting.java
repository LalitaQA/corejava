package ch02_datatypes;

public class D_05_TypeCasting {

	public static void main(String[] args) {
		// The process of converting a value from one data type to another.It is also
		// known as primitive typecasting.

		// 1.Program to Convert Char into Integer
		char ch = 'a';
		// Order: byte → short → char → int → long → float → double.(Widening)
		int result = ch;// Widening implicit
		System.out.println(result);
		System.out.println("------------------------------------------");

		// 2.Program to Convert char into Double
		char num = 'c';
		// Order: byte → short → char → int → long → float → double.(Widening)
		double innum = (double) num;// Widening explicit
		System.out.println(innum);
		System.out.println("------------------------------------------");

		// 3.Program to Convert Integer into Char
		int x = 500;
		// Order: double → float → long → int → char → short → byte.(Narrowing)
		char a = (char) x;// Narrowing explicit
		System.out.println(a);
		System.out.println("------------------------------------------");
	}
}
