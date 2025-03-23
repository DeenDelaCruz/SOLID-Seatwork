public class StudentDiscount implements DiscountStrategy {
    @Override
    public double getDiscountAmount(double totalAmount) {
        return totalAmount * 0.05;
    }
}
