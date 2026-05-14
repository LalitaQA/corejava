package ch08_objects;

public class O_04_Store_One_Object_In_Another {

	public static void main(String[] args) {
		// create 1st object of class
		O_04_Store_One_Object_In_Another o1 = new O_04_Store_One_Object_In_Another();

		// create 2nd object of class
		O_04_Store_One_Object_In_Another o2 = new O_04_Store_One_Object_In_Another();

		// create reference of class and store 1st address of class
		O_04_Store_One_Object_In_Another o3 = o1;

		System.out.println(o1 == o2);
		System.out.println(o1 == o3);
		System.out.println(o2 == o3);
	}
}
