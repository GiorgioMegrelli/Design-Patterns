package adapter.meteo;

public class WeatherInfoMetricAdapter extends AbstractWeatherInfoImperial {

    private final AbstractWeatherInfoMetric weatherInfoMetric;

    public WeatherInfoMetricAdapter(AbstractWeatherInfoMetric weatherInfoMetric) {
        this.weatherInfoMetric = weatherInfoMetric;
    }

    @Override
    public String getName() {
        return weatherInfoMetric.getName();
    }

    @Override
    public int getElevationFeet() {
        return (int) Math.round(this.weatherInfoMetric.getElevationMeters() * 3.281);
    }

    @Override
    public double getTemperatureFahrenheit() {
        return this.weatherInfoMetric.getTemperatureCelsius() * 9.0 / 5.0 + 32;
    }

}
