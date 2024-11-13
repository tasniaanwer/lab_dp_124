import java.util.ArrayList;
import java.util.List;


class SocialMediaFacebookAPI {
    public List<String> retrieveNotifications() {
        return List.of("Facebook: New comment", "Facebook: New like");
    }

    public void setNotificationAsRead(String notificationId) {
        System.out.println("Facebook: Marked notification '" + notificationId + "' as read.");
    }

    public void deleteNotification(String notificationId) {
        System.out.println("Facebook: Deleted notification '" + notificationId + "'.");
    }
}