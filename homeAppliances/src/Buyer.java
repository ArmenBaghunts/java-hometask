

public class Buyer {
    String name;
    String surname;
    String boughtDate;


    public Buyer(String name, String surname, String boughtDate) {
            this.name=name;
            this.surname=surname;
            this.boughtDate=boughtDate;

    }

    public String toString() {
        return name + " " + surname + "-" + boughtDate ;
    }


}
