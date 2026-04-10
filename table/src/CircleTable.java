class CircleTable extends Table {

    private double radius;

    public CircleTable(int legs, String legsMat,
                       String topMat, double radius) {
        super(legs, legsMat, topMat);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}