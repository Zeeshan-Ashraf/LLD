package design_pattern.behavioral;

import java.util.ArrayList;
import java.util.List;

public class Observable implements ObservableInterface {
    private List<ObserverInterface> observers = new ArrayList<>();
    private int temperature = 0;

    @Override
    public void add(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void remove(ObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverInterface observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setData(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public int getData() {
        return this.temperature;
    }
}
