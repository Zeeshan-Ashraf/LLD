package design_pattern.behavioral.strategy;

public class PayByUPI implements PaymentStrategy {
    private UPI upi;

    @Override
    public void collectPaymentDetails() {
        //input pop up to user to provide UPI details
    }

    @Override
    public boolean pay(int amount) {
        System.out.println(amount + "Payment by UPI done successfully");
        return true;
    }
}
