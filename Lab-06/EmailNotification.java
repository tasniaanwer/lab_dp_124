class EmailNotification implements Notification {
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Sending Email to " + receiver + " with message: " + message);
    }
}