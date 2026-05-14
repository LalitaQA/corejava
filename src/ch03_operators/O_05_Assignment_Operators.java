package ch03_operators;

public class O_05_Assignment_Operators {

	public static void main(String[] args) {

		int num = 10;

		num += 5; // num = num + 5
		System.out.println("After addition += : " + num);

		num -= 3; // num = num - 3
		System.out.println("After subtraction -= : " + num);

		num *= 2; // num = num * 2
		System.out.println("After multiplication *= : " + num);

		num /= 4; // num = num / 4
		System.out.println("After division /= : " + num);

		num %= 3; // num = num % 3
		System.out.println("After Modolus %= : " + num);
	}
}
