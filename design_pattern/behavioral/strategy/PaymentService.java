package design_pattern.behavioral.strategy;

public class PaymentService {
    PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
            paymentStrategy.pay(amount);
    }
}
