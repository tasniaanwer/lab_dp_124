class SMSNotification implements Notification {
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Sending SMS to " + receiver + " with message: " + message);
    }
}