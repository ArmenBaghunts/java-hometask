
public class Main2 {

    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 500000, 10);
        Product p2 = new Product(2, "Phone", 300000, 20, 5);

        Product.setDiscountRate(10);

        System.out.println("Laptop final price: " + p1.calculateFinalPrice());
        System.out.println("Phone final price: " + p2.calculateFinalPrice());
    }
}