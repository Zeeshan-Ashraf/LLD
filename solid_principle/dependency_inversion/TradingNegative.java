package solid_principle.dependency_inversion;

/**
 * negative example of dependency inversion where Class is dependent on SMSNotificationService & EmailNotificationService
 * TradingNegative has-a SMSNotificationService & EmailNotificationService
 * Why it is bad? : because if we need to add new notification service (lets say WhatsApp) then we need to change class's update() method &
 * work according to method signature provided by this new service
 */
public class TradingNegative {
    SMSNotificationService smsNotifcationService = new SMSNotificationService();
    EmailNotificationService emailNotificationService = new EmailNotificationService();

    public void update() {
        smsNotifcationService.sendSMS("1234567890");
        emailNotificationService.sendEmail("abc@gmail.com");
    }
}
