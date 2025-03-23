public class SeniorCitizenDiscount implements DiscountStrategy {
    @Override
    public double getDiscountAmount(double totalAmount) {
        return totalAmount * 0.10;
    }
}
