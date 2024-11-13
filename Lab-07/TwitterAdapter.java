import java.util.ArrayList;
import java.util.List;

class TwitterAdapter implements SocialMediaAPI {
    private TwitterAPI twitterAPI;

    public TwitterAdapter() {
        this.twitterAPI = new TwitterAPI();
    }

    @Override
    public List<Notification> getNotifications() {
        List<String> rawNotifications = twitterAPI.getNotifications();
        List<Notification> notifications = new ArrayList<>();
        for (int i = 0; i < rawNotifications.size(); i++) {
            notifications.add(new Notification(String.valueOf(i + 1), rawNotifications.get(i)));
        }
        return notifications;
    }

    @Override
    public void markAsRead(String notificationId) {
        twitterAPI.markAsRead(notificationId);
    }

    @Override
    public void deleteNotification(String notificationId) {
        twitterAPI.deleteNotification(notificationId);
    }
}