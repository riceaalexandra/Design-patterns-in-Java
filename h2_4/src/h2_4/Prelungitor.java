package h2_4;

import java.util.ArrayList;
import java.util.List;

public class Prelungitor {
    private List<Observer> observers;

    public Prelungitor() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void plugIn() {
        // logic for plugging in the extension cord
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}