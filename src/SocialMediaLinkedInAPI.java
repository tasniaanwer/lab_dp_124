import java.util.ArrayList;
import java.util.List;


class SocialMediaLinkedInAPI {
    public List<String> retrieveNotifications() {
        return List.of("LinkedIn: New connection request", "LinkedIn: New message");
    }

    public void setNotificationAsRead(String notificationId) {
        System.out.println("LinkedIn: Marked notification '" + notificationId + "' as read.");
    }

    public void deleteNotification(String notificationId) {
        System.out.println("LinkedIn: Deleted notification '" + notificationId + "'.");
    }
}
