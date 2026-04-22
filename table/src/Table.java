abstract class Table {

    private int legsCount;
    private String legsMaterial;
    private String surfaceMaterial;

    public Table(int legsCount, String legsMaterial, String topMaterial) {
        this.legsCount = legsCount;
        this.legsMaterial = legsMaterial;
        this.surfaceMaterial = surfaceMaterial;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getLegsMaterial() {
        return legsMaterial;
    }

    public String getSurfaceMaterial() {
        return surfaceMaterial;
    }

    abstract public double area();
}