import java.util.*;

public class Main {

    public static void turnOffAllLights(List<ResidentialBuilding> list) {
        for (ResidentialBuilding b : list) {
            b.turnLightsOff();
        }
    }

    public static void main(String[] args) {

        Apartment a = new Apartment(3, 80, 2);
        PrivateHouse h = new PrivateHouse(4, 120);

        a.turnLightsOn();
        h.turnLightsOn();

        List<ResidentialBuilding> list = new ArrayList<>();
        list.add(a);
        list.add(h);

        turnOffAllLights(list);
    }
}
