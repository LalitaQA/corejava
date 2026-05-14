package ch06_Array;

public class A_03_Find_Length_Of_Array {

	public static void main(String[] args) {
		int marks[] = new int[5];
		System.out.println("reference address of marks " + marks);// print reference address of marks
		System.out.println("Length of array " + marks.length);// print length of array
		System.out.println("actual count of data store in array " + (marks.length - 1));// actual count of data store in
																						// array
	}
}
