package adapter.meteo;

public class WeatherInfoMetric extends AbstractWeatherInfoMetric {

    private final String name;
    private final int elevationMeters;
    private final double temperatureCelsius;

    public WeatherInfoMetric(String name, int elevationMeters, double temperatureCelsius) {
        this.name = name;
        this.elevationMeters = elevationMeters;
        this.temperatureCelsius = temperatureCelsius;
    }

    public String getName() {
        return this.name;
    }

    public int getElevationMeters() {
        return this.elevationMeters;
    }

    public double getTemperatureCelsius() {
        return this.temperatureCelsius;
    }

}
