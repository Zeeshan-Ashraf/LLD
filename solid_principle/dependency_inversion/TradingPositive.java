package solid_principle.dependency_inversion;

public class TradingPositive {
    public void update(NotificationService notificationService, String message) {
        notificationService.sendNotification(message);
    }
}
