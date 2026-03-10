class Product {

    int id;
    String name;
    double price;
    int quantity;
    double extraDiscount;

    static double discountRate = 0;


    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.extraDiscount = 0;
    }


    Product(int id, String name, double price, int quantity, double extraDiscount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.extraDiscount = extraDiscount;
    }


    static void setDiscountRate(double rate) {
        discountRate = rate;
    }


    double calculateFinalPrice() {

        double priceAfterStoreDiscount = price - (price * discountRate / 100);
        double finalPrice = priceAfterStoreDiscount - (priceAfterStoreDiscount * extraDiscount / 100);

        return finalPrice;
    }
}
