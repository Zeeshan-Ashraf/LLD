package solid_principle.dependency_inversion;

public class EmailNotification implements NotificationService {
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }


    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}
