package adapter;

import adapter.meteo.*;

public class Example {

    public static void main(String[] args) {
        AbstractWeatherInfoImperial weatherInfoImperial
                = new WeatherInfoImperial("Imperitown", 100, 12);
        AbstractWeatherInfoMetric weatherInfoMetric
                = new WeatherInfoMetric("MetroCity", 975, 36.6);

        System.out.println(weatherInfoImperial);
        System.out.println(weatherInfoMetric);
        System.out.println(new WeatherInfoMetricAdapter(weatherInfoMetric));
    }

}
