public class Main {
    public static void main(String[] args) {

        // Tablet example
        PillBottle<Tablet> bottle1 = new PillBottle<>();
        bottle1.pack(new Tablet("Paracetamol"));

        Tablet t = bottle1.unpack();
        System.out.println("Tablet: " + t.getName());

        // Capsule example
        PillBottle<Capsule> bottle2 = new PillBottle<>();
        bottle2.pack(new Capsule("Amoxicillin"));

        Capsule c = bottle2.unpack();
        System.out.println("Capsule: " + c.getName());


    }
}