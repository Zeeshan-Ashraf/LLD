package design_pattern.behavioral.strategy;

public class PayByCreditCard implements PaymentStrategy {
    private CreditCard creditCard;


    @Override
    public void collectPaymentDetails() {
        //input pop up to user to provide card details
        creditCard = new CreditCard("1234567890", "11/25");
    }

    @Override
    public boolean pay(int amount) {
        System.out.println(amount + " Payment by credit card done successfully");
        return true;
    }
}
