public class Customer {
    private String customerName;
    private DiscountStrategy discountStrategy;

    public Customer(String customerName, DiscountStrategy discountStrategy) {
        this.customerName = customerName;
        this.discountStrategy = discountStrategy;
    }

    public double getDiscountedPrice(double totalAmount) {
        return totalAmount - discountStrategy.getDiscountAmount(totalAmount);
    }
}
