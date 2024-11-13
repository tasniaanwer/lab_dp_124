class SocialMediaNotification {
    private String notificationId;
    private String notificationMessage;

    public SocialMediaNotification(String notificationId, String notificationMessage) {
        this.notificationId = notificationId;
        this.notificationMessage = notificationMessage;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    @Override
    public String toString() {
        return "SocialMediaNotification{id='" + notificationId + "', message='" + notificationMessage + "'}";
    }
}