import java.util.List;

class LinkedInAPI {
    public List<String> getNotifications() {
        return List.of("LinkedIn: New connection request", "LinkedIn: New message");
    }

    public void markAsRead(String notificationId) {
        System.out.println("LinkedIn: Marked notification '" + notificationId + "' as read.");
    }

    public void deleteNotification(String notificationId) {
        System.out.println("LinkedIn: Deleted notification '" + notificationId + "'.");
    }
}