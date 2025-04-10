package design_pattern.behavioral.observer;

public class Subscriber2 implements Subscriber{
    private Publisher publisher;

    public Subscriber2(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void update() {
        System.out.println("Send SMS with message temperature: " + publisher.getTemperature() );
    }
}
