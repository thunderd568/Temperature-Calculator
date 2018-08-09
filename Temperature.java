package Temperature;

public class Temperature {

	public static double calculateFahrenheit(double temp) {
		double fahrenheit = (temp * (9.0/5.0)) + 32.0;
		return fahrenheit;
	}
	
	public static double calculateCelsius(double temp) {
		double celcius = (temp - 32.0) * (5.0/9.0);
		return celcius;
	}
}
