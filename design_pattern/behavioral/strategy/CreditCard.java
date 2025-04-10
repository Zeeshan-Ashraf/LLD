package design_pattern.behavioral.strategy;

public class CreditCard {
    private final String cardNumber;
    private final String expirationDate;

    public CreditCard(String cardNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber.substring(0, 3) + "XXXXXXXXX";
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
