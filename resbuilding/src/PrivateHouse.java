class PrivateHouse extends ResidentialBuilding {

    private boolean gateOpen = false;

    public PrivateHouse(int rooms, double area) {
        super(rooms, area);
    }

    public void openGate() {
        gateOpen = true;
    }

    public void closeGate() {
        gateOpen = false;
    }
}



