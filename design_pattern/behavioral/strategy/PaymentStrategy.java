package design_pattern.behavioral.strategy;

public interface PaymentStrategy {
    public void collectPaymentDetails();
    public boolean pay(int amount);
}
