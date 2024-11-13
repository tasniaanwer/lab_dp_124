public class DigitalWallet implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        if (amount > 0) {
            System.out.println("Digital Wallet: Processing payment of $" + amount);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }
}
