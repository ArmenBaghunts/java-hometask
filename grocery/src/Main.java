import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Depot<Grocery> depot = new Depot<>(1000);

        Grocery sugar = new Grocery(
                "Sugar",
                LocalDate.of(2026, 1, 10),
                LocalDate.of(2027, 1, 10),
                0.8,
                "Sweet Factory"
        );

        Grocery flour = new Grocery(
                "Flour",
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 8, 1),
                1.2,
                "Mill Company"
        );

        depot.add(sugar, 100); // 80 ծավալ
        depot.add(flour, 50);  // 60 ծավալ

        System.out.println(depot.getCurrentVolume()); // 140

        depot.remove(sugar, 20); // -16 ծավալ

        System.out.println(depot.getCurrentVolume()); // 124
        System.out.println(depot.getFreeVolume());    // 876
    }
}