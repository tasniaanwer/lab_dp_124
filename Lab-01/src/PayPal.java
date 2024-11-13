public class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        if (amount > 0) {
            System.out.println("PayPal: Processing payment of $" + amount);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }
}
