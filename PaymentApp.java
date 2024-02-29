public class PaymentApp {

    public static void main(String[] args){

        Order order = new Order("keyboard", 300.0, 10, new GCash());

        System.out.println("Order item is " + order.getItem() +
                "\nUnit price is " + order.getUnitPrice() +
                "\nQuantity is " + order.getQuantity());

        PaymentMode mode = order.getMode();
        System.out.println("\nPayment order details if " + mode.getClass().getSimpleName() +
                "\nDiscount rate is " + mode.determineDiscountRate() +
                "\nPayment amount is " + order.getTotalAmount());

        order.setMode(new Maya());
        order.setTotalAmount();
        mode = order.getMode();
        System.out.println("\nPayment order details if " + mode.getClass().getSimpleName() +
                "\nDiscount rate is " + mode.determineDiscountRate() +
                "\nPayment amount is " + order.getTotalAmount());

        order.setMode(new ShopeePay());
        order.setTotalAmount();
        mode = order.getMode();
        System.out.println("\nPayment order details if " + mode.getClass().getSimpleName() +
                "\nDiscount rate is " + mode.determineDiscountRate() +
                "\nPayment amount is " + order.getTotalAmount());
    }

}
