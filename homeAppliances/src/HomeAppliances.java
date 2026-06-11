import java.util.LinkedList;

public class HomeAppliances {
    String typeName;
    int power;
    int voltage;

    public HomeAppliances(String typeName, int power, int voltage) {
        this.typeName = typeName;
        this.power = power;
        this.voltage = voltage;
    }

        public boolean equals(HomeAppliances o) {
            if (this == o) {
                return true;
            }

            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            HomeAppliances other = (HomeAppliances) o;

            return typeName.equals(other.typeName);
        }

        @Override
        public int hashCode() {
            return typeName.hashCode() ;
        }

    }





