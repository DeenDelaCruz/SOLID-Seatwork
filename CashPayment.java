public class CashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Cash payment of: $" + amount);
    }
}
