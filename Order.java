public class Order {
    private String item;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
    private PaymentMode mode;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount() {
        this.calculateTotalAmount();
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }
    public Order(String item, Double unitPrice, Integer quantity, PaymentMode mode) {
        this.item = item;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.mode = mode;
        this.calculateTotalAmount();
    }

    private void calculateTotalAmount() {
        Double amount = quantity * unitPrice;
        double discountRate = mode.determineDiscountRate();
        totalAmount = amount - (discountRate * amount);
    }
}