package ch06_Array;

public class A_04_Traverse_In_Array_Using_For {

	public static void main(String[] args) {
		String names[] = new String[4];
		names[0] = "cow";
		names[1] = "dog";
		names[3] = "cat";
		for (int index = 0; index <= names.length - 1; index++) {
			System.out.println(names[index]);
		}
	}
}
