import java.time.LocalDate;
import java.util.Objects;

public class Grocery {

    private String name;
    private LocalDate productionDate;
    private LocalDate expirationDate;
    private double volumePerKg;
    private String manufacturer;

    public Grocery(String name,
                   LocalDate productionDate,
                   LocalDate expirationDate,
                   double volumePerKg,
                   String manufacturer) {

        this.name = name;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.volumePerKg = volumePerKg;
        this.manufacturer = manufacturer;
    }

    public double getVolumePerKg() {
        return volumePerKg;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grocery grocery)) return false;

        return Objects.equals(name, grocery.name)
                && Objects.equals(manufacturer, grocery.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer);
    }
}