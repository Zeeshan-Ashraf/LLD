package design_pattern.behavioral.observer;

public class Observer implements ObserverInterface {
    private ObservableInterface observable;

    public Observer( ObservableInterface observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        sendNotification(observable.getData());
    }

    private void sendNotification(int data) {
        System.out.println("Notification sent: temperature" + data);
    }
}
