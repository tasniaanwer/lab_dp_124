import java.util.List;

class FacebookAPI {
    public List<String> getNotifications() {
        return List.of("Facebook: New comment", "Facebook: New like");
    }

    public void markAsRead(String notificationId) {
        System.out.println("Facebook: Marked notification '" + notificationId + "' as read.");
    }

    public void deleteNotification(String notificationId) {
        System.out.println("Facebook: Deleted notification '" + notificationId + "'.");
    }
}