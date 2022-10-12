package adapter.meteo;

public class WeatherInfoImperial extends AbstractWeatherInfoImperial {

    private final String name;
    private final int elevationFeet;
    private final double temperatureFahrenheit;

    public WeatherInfoImperial(String name, int elevationFeet, double temperatureFahrenheit) {
        this.name = name;
        this.elevationFeet = elevationFeet;
        this.temperatureFahrenheit = temperatureFahrenheit;
    }

    public String getName() {
        return this.name;
    }

    public int getElevationFeet() {
        return this.elevationFeet;
    }

    public double getTemperatureFahrenheit() {
        return this.temperatureFahrenheit;
    }

}
