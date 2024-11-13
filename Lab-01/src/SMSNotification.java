public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message, Rider userContact) {
        if (message != null && !message.isEmpty()) {
            System.out.println("Sending SMS to " + userContact.getName() + ": " + message);
        } else {
            System.out.println("Invalid message content.");
        }
    }
}
