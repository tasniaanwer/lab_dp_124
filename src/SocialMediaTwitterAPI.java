
import java.util.ArrayList;
import java.util.List;

class SocialMediaTwitterAPI {
    public List<String> retrieveNotifications() {
        return List.of("Twitter: New follower", "Twitter: New mention");
    }

    public void setNotificationAsRead(String notificationId) {
        System.out.println("Twitter: Marked notification '" + notificationId + "' as read.");
    }

    public void deleteNotification(String notificationId) {
        System.out.println("Twitter: Deleted notification '" + notificationId + "'.");
    }
}
