package src.ObserverPattern.ObserverPatternHandCraft;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observersList;
    private DataWeather data;

    public WeatherData() {
        observersList = new ArrayList<Observer>();
    }

    public void setData(DataWeather data) {
        this.data = data;
        this.measurementsChanged();
    }

    public void registerObserver(Observer observer) {
        observersList.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observersList.indexOf(observer);
        observersList.remove(index);
    }

    public void notifyObservers() {
        for (int i = 0; i < observersList.size(); i++) {
            Observer observer = observersList.get(i);
            observer.update(data);
        }
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

}
