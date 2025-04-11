package solid_principle.dependency_inversion;

public class TradingPositive {
    NotificationService notificationService;
    public TradingPositive(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    /**
     * dependency injection via method / setter is not recommended when class depends on another Object (or Class)
     * i.e in HAS-A (composition) relationship Class should be created along with dependents creation to avoid runtime error to ensure
     * dependent classes are initialized and available, hence dependents should be injected through Constructor
     */
//      wrong way
//    public void update(NotificationService notificationService, String message) {
//        notificationService.sendNotification(message);
//    }

//    right way
    public void update(String message) {
        notificationService.sendNotification(message);
    }
}
