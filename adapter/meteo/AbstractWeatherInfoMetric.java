package adapter.meteo;

public abstract class AbstractWeatherInfoMetric {

    public abstract String getName();

    public abstract int getElevationMeters();

    public abstract double getTemperatureCelsius();

    public String toString() {
        return String.format(
                "%s (%d m., %.1f °C)",
                this.getName(),
                this.getElevationMeters(),
                this.getTemperatureCelsius()
        );
    }

}
