package src.ObserverPattern.ObserverPatternHandCraft;

public class WeatherStation {
    public static void main(String[] args) {
        DataWeather data = new DataWeather(10, 20, 30);
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setData(data);
    }
}
