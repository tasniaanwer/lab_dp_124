import java.util.List;

interface SocialMediaAPI {
    List<Notification> getNotifications();
    void markAsRead(String notificationId);
    void deleteNotification(String notificationId);
}