public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();

        emailNotification.sendNotification("user@example.com", "This is an email message.");
        smsNotification.sendNotification("+1234567890", "This is an SMS message.");

        EPostalMailService ePostalMailService = new EPostalMailService();
        Notification postalMailNotification = new EPostalMailAdapter(ePostalMailService);

        postalMailNotification.sendNotification("John Doe,123 Main St,90210", "This is a postal mail message.");
    }
}
