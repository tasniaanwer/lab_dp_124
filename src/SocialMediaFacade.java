
import java.util.ArrayList;
import java.util.List;

class SocialMediaFacade {
    private List<SocialMediaInterface> integratedPlatforms;

    public SocialMediaFacade() {
        this.integratedPlatforms = new ArrayList<>();
        this.integratedPlatforms.add(new SocialMediaTwitterAdapter());
        this.integratedPlatforms.add(new SocialMediaFacebookAdapter());
        this.integratedPlatforms.add(new SocialMediaLinkedInAdapter());
    }

    public List<SocialMediaNotification> getAllNotifications() {
        List<SocialMediaNotification> aggregatedNotifications = new ArrayList<>();
        for (SocialMediaInterface platform : integratedPlatforms) {
            aggregatedNotifications.addAll(platform.fetchNotifications());
        }
        return aggregatedNotifications;
    }

    public void markNotification(String notificationId, String platformName) {
        for (SocialMediaInterface platform : integratedPlatforms) {
            if (platform.getClass().getSimpleName().toLowerCase().contains(platformName.toLowerCase())) {
                platform.markNotificationAsRead(notificationId);
                return;
            }
        }
        System.out.println("Platform not supported.");
    }

    public void deleteNotification(String notificationId, String platformName) {
        for (SocialMediaInterface platform : integratedPlatforms) {
            if (platform.getClass().getSimpleName().toLowerCase().contains(platformName.toLowerCase())) {
                platform.removeNotification(notificationId);
                return;
            }
        }
        System.out.println("Platform not supported.");
    }
}