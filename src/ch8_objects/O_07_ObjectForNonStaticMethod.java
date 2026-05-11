package ch8_objects;

public class O_07_ObjectForNonStaticMethod {
	// non static method
	void demo() {
		System.out.println("Non-static method execution");
	}

	public static void main(String[] args) {
		System.out.println("Main method stsrts");
		// create an object
		O_07_ObjectForNonStaticMethod ref = new O_07_ObjectForNonStaticMethod();
		ref.demo();
		// create one more object
		O_07_ObjectForNonStaticMethod ref1 = new O_07_ObjectForNonStaticMethod();
		ref1.demo();
	}
}
