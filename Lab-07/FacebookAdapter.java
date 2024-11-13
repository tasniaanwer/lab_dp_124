import java.util.ArrayList;
import java.util.List;

class FacebookAdapter implements SocialMediaAPI {
    private FacebookAPI facebookAPI;

    public FacebookAdapter() {
        this.facebookAPI = new FacebookAPI();
    }

    @Override
    public List<Notification> getNotifications() {
        List<String> rawNotifications = facebookAPI.getNotifications();
        List<Notification> notifications = new ArrayList<>();
        for (int i = 0; i < rawNotifications.size(); i++) {
            notifications.add(new Notification(String.valueOf(i + 1), rawNotifications.get(i)));
        }
        return notifications;
    }

    @Override
    public void markAsRead(String notificationId) {
        facebookAPI.markAsRead(notificationId);
    }

    @Override
    public void deleteNotification(String notificationId) {
        facebookAPI.deleteNotification(notificationId);
    }
}
