package solid_principle.dependency_inversion;

/**
 * Demonstrating Dependency Inversion i.e High level (e.g controller class)  module should not depend on (tied to) low level module (e.g DAO)
 * https://docs.google.com/document/d/1Fnul82HZhGmB0C-xm9gwiK4LIy76-Hg98xjK0a1Jq1w/edit?tab=t.0#heading=h.fy7s4y17im6u
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("DI negative case");
        TradingNegative tradingNegative = new TradingNegative();
        tradingNegative.update();

        System.out.println("\n\nDI positive case");
        EmailNotification emailNotification = new EmailNotification("abd@gmail.com");
        SMSNotification smsNotification = new SMSNotification("1234567890");

        TradingPositive tradingPositiveEmail = new TradingPositive(emailNotification);
        tradingPositiveEmail.update("TEST email message");

        TradingPositive tradingPositiveSMS = new TradingPositive(smsNotification);
        tradingPositiveSMS.update("TEST sms message");
    }
}
