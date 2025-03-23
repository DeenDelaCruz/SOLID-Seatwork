public class EWalletPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing E-Wallet payment of: $" + amount);
    }
}
