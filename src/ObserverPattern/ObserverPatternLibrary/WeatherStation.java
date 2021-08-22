package src.ObserverPattern.ObserverPatternLibrary;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(10, 20, 30);
    }

}
