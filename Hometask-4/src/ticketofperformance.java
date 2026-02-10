import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Seating order: ");
        int seatingorder = sc.nextInt();

        double price = 0;
        double discount;

        switch (seatingorder) {
            case 1 -> price = 12000;
            case 2 -> price = 9000;
            case 3 -> price = 7000;
            default -> System.out.println("Invalid seating order");
        }

        if (price > 0) {
            if (age < 65) {
                System.out.println("Price = " + price);
            } else {
                System.out.println("Initial price = " + price);
                discount = price * 20 / 100;
                price -= discount;
                System.out.println("Discount = " + discount);
                System.out.println("Final price = " + price);
            }
        }

        sc.close();
    }
}
