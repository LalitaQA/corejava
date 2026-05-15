package ch10_constructoroverloading;

public class CO_04_BasedOnOrderOfOccurence {
	// overloading constructor based on Order Of Occurence of datatypes
	CO_04_BasedOnOrderOfOccurence(String brand, double price) {
		System.out.println("Brand :" + brand);
		System.out.println("Price :" + price);
	}

	CO_04_BasedOnOrderOfOccurence(double price, String brand) {
		System.out.println("Brand :" + brand);
		System.out.println("Price :" + price);
	}

	public static void main(String[] args) {
		new CO_04_BasedOnOrderOfOccurence(900000, "Asus");
		new CO_04_BasedOnOrderOfOccurence("HCL", 800000);
	}
}
