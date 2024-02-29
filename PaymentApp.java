public class PaymentApp {

    public static void main(String[] args){

        Order order = new Order("keyboard", 300.0, 10, new GCash());
        System.out.println("Order item is " + order.getItem());
        System.out.println("Unit price is " + order.getUnitPrice());
        System.out.println("Quantity is " + order.getQuantity());

        System.out.println("\nPayment order details if " + order.getMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + order.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

        order.setMode(new Maya());
        order.setTotalAmount();
        System.out.println("\nPayment order details if " + order.getMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + order.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

        order.setMode(new ShopeePay());
        order.setTotalAmount();
        System.out.println("\nPayment order details if " + order.getMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + order.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

    }

}