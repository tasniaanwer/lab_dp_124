import java.util.ArrayList;
import java.util.List;

class SocialMediaFacade {
    private List<SocialMediaAPI> platforms;

    public SocialMediaFacade() {
        this.platforms = new ArrayList<>();
        this.platforms.add(new TwitterAdapter());
        this.platforms.add(new FacebookAdapter());
        this.platforms.add(new LinkedInAdapter());
    }

    public List<Notification> getAllNotifications() {
        List<Notification> allNotifications = new ArrayList<>();
        for (SocialMediaAPI platform : platforms) {
            allNotifications.addAll(platform.getNotifications());
        }
        return allNotifications;
    }

    public void markNotificationAsRead(String notificationId, String platform) {
        for (SocialMediaAPI api : platforms) {
            if (api.getClass().getSimpleName().toLowerCase().contains(platform.toLowerCase())) {
                api.markAsRead(notificationId);
                return;
            }
        }
        System.out.println("Platform not supported.");
    }

    public void deleteNotification(String notificationId, String platform) {
        for (SocialMediaAPI api : platforms) {
            if (api.getClass().getSimpleName().toLowerCase().contains(platform.toLowerCase())) {
                api.deleteNotification(notificationId);
                return;
            }
        }
        System.out.println("Platform not supported.");
    }
}