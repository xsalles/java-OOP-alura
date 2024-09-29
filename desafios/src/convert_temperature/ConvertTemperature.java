package convert_temperature;

public class ConvertTemperature implements DefaultConvertTemperature {
    private double celsius;
    private double fahrenheit;

    @Override
    public double formCelsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    @Override
    public double formFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double getFahrenheit() {
        return formCelsiusToFahrenheit(celsius);
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return formFahrenheitToCelsius(fahrenheit);
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;

    }
}
