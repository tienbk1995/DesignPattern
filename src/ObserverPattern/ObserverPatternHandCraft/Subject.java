package src.ObserverPattern.ObserverPatternHandCraft;

public interface Subject {
    public void registerObserver(Observer object);

    public void removeObserver(Observer object);

    public void notifyObservers();
}
