package design_pattern.behavioral.observer;

public interface ObservableInterface {
    public void add(ObserverInterface observer);
    public void remove(ObserverInterface observer);
    public void notifyObservers();
    public void setData(int temperature);
    public int getData();
}
