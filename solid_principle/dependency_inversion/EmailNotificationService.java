package solid_principle.dependency_inversion;

public class EmailNotificationService {
    public void sendEmail(String to) {
        System.out.println("Email sent to " + to );
    }
}
