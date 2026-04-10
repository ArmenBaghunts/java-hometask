class Table {

    private int legsCount;
    private String legsMaterial;
    private String topMaterial;

    public Table(int legsCount, String legsMaterial, String topMaterial) {
        this.legsCount = legsCount;
        this.legsMaterial = legsMaterial;
        this.topMaterial = topMaterial;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getLegsMaterial() {
        return legsMaterial;
    }

    public String getTopMaterial() {
        return topMaterial;
    }

    public double area() {
        return 0;
    }
}