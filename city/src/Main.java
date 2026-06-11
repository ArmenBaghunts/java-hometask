import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = new ArrayList<>();

        cities.add(new City("Armenia", "Syunik", "Goris"));
        cities.add(new City("Armenia", "Shirak", "Gyumri"));
        cities.add(new City("Georgia", "Imereti", "Kutaisi"));
        cities.add(new City("Armenia", "Yerevan", "Yerevan"));

        Collections.sort(cities);

        System.out.println("Sorted cities:");
        for (City city : cities) {
            System.out.println(city);
        }

        City searchCity =
                new City("Armenia", "Syunik", "Goris");

        System.out.println();
        System.out.println(
                "Contains city: "
                        + cities.contains(searchCity));
    }
}