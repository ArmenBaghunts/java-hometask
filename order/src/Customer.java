public class Customer {
    String name;
    String purchaseDate;
    String address;

    public Customer(String name,  String address, String purchaseDate) {
        this.name=name;
        this.purchaseDate=purchaseDate;
        this.address=address;
    }

    public String toString() {
        return name + ", " + address + ", " + purchaseDate + ";";
    }

}
