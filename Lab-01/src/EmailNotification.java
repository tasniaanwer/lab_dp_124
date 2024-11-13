public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message, Rider userContact) {
        if (message != null && !message.isEmpty()) {
            System.out.println("Sending Email to " + userContact.getName() + ": " + message);
        } else {
            System.out.println("Invalid message content.");
        }
    }
}
