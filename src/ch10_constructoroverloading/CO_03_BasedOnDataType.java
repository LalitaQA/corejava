package ch10_constructoroverloading;

public class CO_03_BasedOnDataType {
	//overloading constructor based on datatypes
	CO_03_BasedOnDataType(String name, long phno) {
		System.out.println("Name :" + name);
		System.out.println("Phone :" + phno);
	}

	CO_03_BasedOnDataType(int rno, long phno) {
		System.out.println("Roll no :" + rno);
		System.out.println("Phone :" + phno);
	}

	public static void main(String[] args) {
		new CO_03_BasedOnDataType(11, 56898900088L);
		new CO_03_BasedOnDataType("Harshita", 967277238328L);
	}
}
