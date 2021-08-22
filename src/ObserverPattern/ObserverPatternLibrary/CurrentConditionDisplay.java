package src.ObserverPattern.ObserverPatternLibrary;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observable, Observer {
    Observable observer;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observer) {
        this.observer = observer;
        observer.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println('current conditions: ' + temperature
        + 'F degrees and ' + humidity + '% humidity');
    }

}
