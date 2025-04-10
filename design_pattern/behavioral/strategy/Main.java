package design_pattern.behavioral.strategy;

/**
 * Different strategies for 1 task. So that we can use any strategy as per need
 * https://docs.google.com/document/d/1Fnul82HZhGmB0C-xm9gwiK4LIy76-Hg98xjK0a1Jq1w/edit?tab=t.0#heading=h.nop57oki4guz
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("strategy pattern");

        PaymentStrategy paymentStrategy = new PayByCreditCard();

        //Inject payment strategy as per need dynamically
        PaymentService paymentService = new PaymentService(paymentStrategy);
        paymentService.pay(100);
    }
}
