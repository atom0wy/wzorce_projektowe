package wzorce_projektowe.observer;

import java.util.LinkedList;
import java.util.List;

public class Observable {
    List<Observer> observers;

    public Observable() {
        this.observers = new LinkedList<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        observers.forEach(Observer::update);
    }
}