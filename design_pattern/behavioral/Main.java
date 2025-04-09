package design_pattern.behavioral;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Observable observable = new Observable();

        Observer observer1 = new Observer(observable);
        Observer observer2 = new Observer(observable);

        observable.add(observer1);
        observable.add(observer2);

        observable.setData(10);
    }
}
