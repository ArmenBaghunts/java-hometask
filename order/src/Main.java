import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, "TV");
        Order order2 = new Order(2, "Vacuum cleaner");
        Order order3 = new Order(3, "Refrigirator");
        Order order4 = new Order(4, "Stove");
        Order order5 = new Order(5, "Pan");

        Customer buyer1 = new Customer("Narek", "Goris, Syuniq 41", "28-12-2025");
        Customer buyer2 = new Customer("Gegham", "Goris,Avangard 15", "25-12-2025");
        ArrayList<Order>  list1 = new ArrayList<>();
        ArrayList<Order>  list2 = new ArrayList<>();

        HashMap<Customer, ArrayList<Order>> map = new HashMap<>();

        list1.add(order1);
        list1.add(order2);
        list1.add(order3);
        list2.add(order4);
        list2.add(order5);

        map.put(buyer1, list1);
        System.out.println("The number of itmes bought by Narek equals " + map.get(buyer1).size());

        map.put(buyer2, list2);
        System.out.println();
        System.out.println("The number of itmes bought by Gegham equals " + map.get(buyer2).size());

    }
}
