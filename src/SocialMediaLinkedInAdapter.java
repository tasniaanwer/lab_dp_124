import java.util.ArrayList;
import java.util.List;


class SocialMediaLinkedInAdapter implements SocialMediaInterface {
    private SocialMediaLinkedInAPI linkedInApiService;

    public SocialMediaLinkedInAdapter() {
        this.linkedInApiService = new SocialMediaLinkedInAPI();
    }

    @Override
    public List<SocialMediaNotification> fetchNotifications() {
        List<String> rawLinkedInNotifications = linkedInApiService.retrieveNotifications();
        List<SocialMediaNotification> formattedNotifications = new ArrayList<>();
        for (int index = 0; index < rawLinkedInNotifications.size(); index++) {
            formattedNotifications.add(new SocialMediaNotification(String.valueOf(index + 1), rawLinkedInNotifications.get(index)));
        }
        return formattedNotifications;
    }

    @Override
    public void markNotificationAsRead(String notificationId) {
        linkedInApiService.setNotificationAsRead(notificationId);
    }

    @Override
    public void removeNotification(String notificationId) {
        linkedInApiService.deleteNotification(notificationId);
    }
}