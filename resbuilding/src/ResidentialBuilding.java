abstract class ResidentialBuilding {
    private final double area;
    private final int initialRooms;
    private int rooms;

    private Double ceilingHeight = null;
    private Boolean hasBalcony = null;

    private boolean lightsOn = false;

    public ResidentialBuilding(int rooms, double area) {
        this.rooms = rooms;
        this.initialRooms = rooms;
        this.area = area;
    }

    // lights
    public void turnLightsOn() {
        lightsOn = true;
    }

    public void turnLightsOff() {
        lightsOn = false;
    }

    // rooms +/-1 only
    public void increaseRooms() {
        if (rooms < initialRooms + 1) {
            rooms++;
        }
    }

    public void decreaseRooms() {
        if (rooms > initialRooms - 1) {
            rooms--;
        }
    }

    // set once
    public void setCeilingHeight(double height) {
        if (ceilingHeight == null) {
            ceilingHeight = height;
        }
    }

    public void setBalcony(boolean value) {
        if (hasBalcony == null) {
            hasBalcony = value;
        }
    }
}