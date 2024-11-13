import java.util.ArrayList;
import java.util.List;

class LinkedInAdapter implements SocialMediaAPI {
    private LinkedInAPI linkedInAPI;

    public LinkedInAdapter() {
        this.linkedInAPI = new LinkedInAPI();
    }

    @Override
    public List<Notification> getNotifications() {
        List<String> rawNotifications = linkedInAPI.getNotifications();
        List<Notification> notifications = new ArrayList<>();
        for (int i = 0; i < rawNotifications.size(); i++) {
            notifications.add(new Notification(String.valueOf(i + 1), rawNotifications.get(i)));
        }
        return notifications;
    }

    @Override
    public void markAsRead(String notificationId) {
        linkedInAPI.markAsRead(notificationId);
    }

    @Override
    public void deleteNotification(String notificationId) {
        linkedInAPI.deleteNotification(notificationId);
    }
}
