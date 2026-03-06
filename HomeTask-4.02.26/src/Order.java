class Order {

    int id;
    String customerName;
    double orderValue;
    int deliveryTime;

    static int totalOrders = 0;
    static double deliveryFee = 1000;


    Order(int id, String customerName, double orderValue) {
        this.id = id;
        this.customerName = customerName;
        this.orderValue = orderValue;
        this.deliveryTime = 30; // default delivery time
        totalOrders++;
    }


    Order(int id, String customerName, double orderValue, int deliveryTime) {
        this.id = id;
        this.customerName = customerName;
        this.orderValue = orderValue;
        this.deliveryTime = deliveryTime;
        totalOrders++;
    }


    double calculateTotal() {
        return orderValue + deliveryFee;
    }
}