package ch06_Array;

public class A_01_Create_An_Array_Using_New {

	public static void main(String[] args) {
		String names[] = new String[4];// Creating an array of string type
		// initializing array
		names[0] = "cat";
		names[1] = "dog";
		names[2] = "elephant";
		names[3] = "girafee";
		// fetching array elements
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	}
}
