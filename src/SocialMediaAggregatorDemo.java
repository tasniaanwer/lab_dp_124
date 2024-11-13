import java.util.ArrayList;
import java.util.List;


public class SocialMediaAggregatorDemo {

    public static void main(String[] args) {
        SocialMediaFacade socialMediaManager = new SocialMediaFacade();

        // Fetch all notifications
        List<SocialMediaNotification> notifications = socialMediaManager.getAllNotifications();
        System.out.println("All Notifications:");
        notifications.forEach(System.out::println);

        // Mark a notification as read
        System.out.println("\nMarking notification as read:");
        socialMediaManager.markNotification("1", "twitter");

        // Delete a notification
        System.out.println("\nDeleting notification:");
        socialMediaManager.deleteNotification("2", "facebook");
    }
}
