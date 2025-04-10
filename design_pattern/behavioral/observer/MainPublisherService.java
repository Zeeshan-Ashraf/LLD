package design_pattern.behavioral.observer;


/**
 * To notify all the Observers (subscribers) when the Subject (publisher) state changes
 * https://docs.google.com/document/d/1Fnul82HZhGmB0C-xm9gwiK4LIy76-Hg98xjK0a1Jq1w/edit?tab=t.0#heading=h.mx03q34ll8eu
 */
public class MainPublisherService {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();


        //add subscribers to Publisher
        publisher.add(new Subscriber1(publisher));
        publisher.add(new Subscriber2(publisher));

        //update temperature which will notify to all subscribers
        publisher.setTemperature("100F");
    }
}
