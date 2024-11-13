public class NotificationService {
    private Notification notificationMethod;

    public NotificationService(Notification notificationMethod) {
        this.notificationMethod = notificationMethod;
    }

    public void sendNotification(String message, Rider userContact) {
        if (userContact != null && message != null && !message.isEmpty()) {
            notificationMethod.sendNotification(message, userContact);
        } else {
            System.out.println("Invalid user or message.");
        }
    }

    public Notification getNotificationMethod() {
        return notificationMethod;
    }

    public void setNotificationMethod(Notification notificationMethod) {
        this.notificationMethod = notificationMethod;
    }
}
