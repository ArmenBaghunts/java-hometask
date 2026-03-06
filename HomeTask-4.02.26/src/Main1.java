
public class Main1 {

    public static void main(String[] args) {

        Order o1 = new Order(1, "Armen", 5000);
        Order o2 = new Order(2, "Anna", 7000, 45);

        System.out.println("Order 1 total: " + o1.calculateTotal());
        System.out.println("Order 2 total: " + o2.calculateTotal());

        System.out.println("Total orders: " + Order.totalOrders);


        Order.deliveryFee = 1500;

        System.out.println("Order 1 new total: " + o1.calculateTotal());
    }
}