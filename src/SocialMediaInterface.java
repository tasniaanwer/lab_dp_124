import java.util.ArrayList;
import java.util.List;


interface SocialMediaInterface {
    List<SocialMediaNotification> fetchNotifications();
    void markNotificationAsRead(String notificationId);
    void removeNotification(String notificationId);
}
