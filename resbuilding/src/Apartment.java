
class Apartment extends ResidentialBuilding {
    private final int floor;
    private static final int MAX_FLOOR = 5;

    public Apartment(int rooms, double area, int floor) {
        super(rooms, area);

        if (floor < 1 || floor > MAX_FLOOR)
            throw new IllegalArgumentException();

        this.floor = floor;
    }
}
