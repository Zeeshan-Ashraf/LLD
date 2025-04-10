package design_pattern.behavioral.observer;

public class Subscriber1 implements Subscriber{
    private Publisher publisher;

    public Subscriber1(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void update() {
        System.out.println("Send EMail with message temperature: " + publisher.getTemperature() );
    }
}
