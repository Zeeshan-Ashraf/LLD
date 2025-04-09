package solid_principle.dependency_inversion;

public class Main {
    public static void main(String[] args) {
        System.out.println("DI negative case");
        TradingNegative tradingNegative = new TradingNegative();
        tradingNegative.update();

        System.out.println("DI positive case");
        TradingPositive tradingPositive = new TradingPositive();

        EmailNotification emailNotification = new EmailNotification("abd@gmail.com");
        tradingPositive.update(emailNotification, "TEST message");

        SMSNotification smsNotification = new SMSNotification("1234567890");
        tradingPositive.update(smsNotification, "TEST message");
    }
}
