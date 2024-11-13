import java.util.ArrayList;
import java.util.List;

class SocialMediaFacebookAdapter implements SocialMediaInterface {
    private SocialMediaFacebookAPI facebookApiService;

    public SocialMediaFacebookAdapter() {
        this.facebookApiService = new SocialMediaFacebookAPI();
    }

    @Override
    public List<SocialMediaNotification> fetchNotifications() {
        List<String> rawFacebookNotifications = facebookApiService.retrieveNotifications();
        List<SocialMediaNotification> formattedNotifications = new ArrayList<>();
        for (int index = 0; index < rawFacebookNotifications.size(); index++) {
            formattedNotifications.add(new SocialMediaNotification(String.valueOf(index + 1), rawFacebookNotifications.get(index)));
        }
        return formattedNotifications;
    }

    @Override
    public void markNotificationAsRead(String notificationId) {
        facebookApiService.setNotificationAsRead(notificationId);
    }

    @Override
    public void removeNotification(String notificationId) {
        facebookApiService.deleteNotification(notificationId);
    }
}
