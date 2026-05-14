package ch06_Array;

public class A_02_Create_An_Array_Using_New {

	public static void main(String[] args) {
		float marks[] = new float[4];// Creating an array of string type
		// initializing array
		marks[0] = 98.7f;
		marks[1] = 56.97f;
		marks[3] = 11.98f;
		// fetching array elements
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
	}
}
