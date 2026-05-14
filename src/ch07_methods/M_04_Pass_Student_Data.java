package ch07_methods;

public class M_04_Pass_Student_Data {

	static void details(int id, float marks) {
		System.out.println("Student data");
		System.out.println("id : " + id);
		System.out.println("marks : " + marks);
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");
		details(1, 78.9f);
		details(2, 89.78f);
		System.out.println("Main method ends");
	}
}
