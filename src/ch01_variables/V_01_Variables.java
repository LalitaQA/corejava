package ch01_variables;

//Variable is a container that stores a value.This value can be change during the execution of the program.

public class V_01_Variables {

	public static void main(String[] args) {
		// local variable
		short rno; // variable declaration : Creating a variable
		rno = 234; // variable initialization : assigning value to variable

		System.out.println(rno);// print variable value

		// re-initialization/updation -assigning new value to existing variable

		rno = 455;
		System.out.println(rno);
	}
}
