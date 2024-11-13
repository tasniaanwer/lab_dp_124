
import java.util.ArrayList;
import java.util.List;

class SocialMediaTwitterAdapter implements SocialMediaInterface {
    private SocialMediaTwitterAPI twitterApiService;

    public SocialMediaTwitterAdapter() {
        this.twitterApiService = new SocialMediaTwitterAPI();
    }

    @Override
    public List<SocialMediaNotification> fetchNotifications() {
        List<String> rawTwitterNotifications = twitterApiService.retrieveNotifications();
        List<SocialMediaNotification> formattedNotifications = new ArrayList<>();
        for (int index = 0; index < rawTwitterNotifications.size(); index++) {
            formattedNotifications.add(new SocialMediaNotification(String.valueOf(index + 1), rawTwitterNotifications.get(index)));
        }
        return formattedNotifications;
    }

    @Override
    public void markNotificationAsRead(String notificationId) {
        twitterApiService.setNotificationAsRead(notificationId);
    }

    @Override
    public void removeNotification(String notificationId) {
        twitterApiService.deleteNotification(notificationId);
    }
}
