package ch08_objects;

public class O_10_ObjectForStaticVariable {
	// static variable
	static String subject;

	public static void main(String[] args) {
		// initializing static variable
		subject = "core java";
		System.out.println("subject :" + subject);// directly using variable

		System.out.println("subject :" + O_10_ObjectForStaticVariable.subject);// use class name as reference

		O_10_ObjectForStaticVariable ref = new O_10_ObjectForStaticVariable();
		System.out.println(ref.subject);// use object reference
	}
}
