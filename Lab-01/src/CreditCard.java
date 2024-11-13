public class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("CreditCard: Processing payment of $" + amount);
    }
}