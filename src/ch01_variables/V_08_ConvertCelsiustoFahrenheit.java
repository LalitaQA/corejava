package ch01_variables;

public class V_08_ConvertCelsiustoFahrenheit {

	public static void main(String[] args) {
		// Take one variables temperature and convert celsius temperature into
		// farenhite.

		int temperature = 3;
		double F;
		// logic F = (C * 9/5) + 32
		F = (temperature * 9 / 5) + 32;
		System.out.print("After converting the celsius temperature into farenhite: ");
		System.out.println(F);
	}
}
