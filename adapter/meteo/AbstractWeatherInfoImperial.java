package adapter.meteo;

import java.text.DecimalFormat;

public abstract class AbstractWeatherInfoImperial {

    public abstract String getName();

    public abstract int getElevationFeet();

    public abstract double getTemperatureFahrenheit();

    public String toString() {
        return String.format(
                "%s (%d ft., %.1f °F)",
                this.getName(),
                this.getElevationFeet(),
                this.getTemperatureFahrenheit()
        );
    }

}
