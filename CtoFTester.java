public class CtoFTester {
 	public static void main(String[] args) {
		System.out.println(celsiusToFahrenheit(20.0));
		System.out.println(fahrenheitToCelsius(40.0));
}
	public static double  celsiusToFahrenheit(double Cel) {
	return ((Cel * 9 / 5) + 32);
	}
        public static double fahrenheitToCelsius(double Far) {
	return ((Far - 32) * 5 /9);
}
}
