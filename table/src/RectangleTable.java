class RectangleTable extends Table {

    protected double length;
    protected double width;

    public RectangleTable(int legs, String legsMat,
                          String topMat, double length, double width) {
        super(legs, legsMat, topMat);
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}
