package design_pattern.behavioral.observer;

import java.util.ArrayList;

public class Publisher {
    private String temperature;
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    public String getTemperature() {
        return temperature;
    }

    public void add(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void remove(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyObservers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
