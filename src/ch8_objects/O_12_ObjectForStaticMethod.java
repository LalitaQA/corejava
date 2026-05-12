package ch8_objects;

public class O_12_ObjectForStaticMethod {
	// static method
	public static void clgInfo() {
		System.out.println("All the college details");
	}

	public static void main(String[] args) {
		// accessing static method
		clgInfo();// directly by using method signature

		O_12_ObjectForStaticMethod.clgInfo();// using class name as reference

		O_12_ObjectForStaticMethod ref = new O_12_ObjectForStaticMethod();
		ref.clgInfo();// using object ref
	}
}
