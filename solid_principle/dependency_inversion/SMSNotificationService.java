package solid_principle.dependency_inversion;

public class SMSNotificationService {
    public void sendSMS(String phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber );
    }
}
