public class Maya implements PaymentMode{
    @Override
    public Double determineDiscountRate() {
        return 0.05;
    }
}