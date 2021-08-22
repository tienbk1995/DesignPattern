package src.ObserverPattern.ObserverPatternHandCraft;

public class CurrentConditionDisplay implements Observer, Display {
    private Subject weatherData;
    private DataWeather data;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(DataWeather data) {
        this.data = data;
        display();
    }

    public void display() {
        System.out.println("Temperature is: " + data.temperature + "\r\n" + " Humidity is: " + data.humidity);
    }
}
