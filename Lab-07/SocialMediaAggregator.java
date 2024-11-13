import java.util.List;

public class SocialMediaAggregator {
    public static void main(String[] args) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade();

        // Get all notifications
        List<Notification> notifications = socialMediaFacade.getAllNotifications();
        System.out.println("All Notifications:");
        notifications.forEach(System.out::println);

        // Interact with notifications
        System.out.println("\nMarking notification as read:");
        socialMediaFacade.markNotificationAsRead("1", "twitter");

        System.out.println("\nDeleting notification:");
        socialMediaFacade.deleteNotification("2", "facebook");
    }
}