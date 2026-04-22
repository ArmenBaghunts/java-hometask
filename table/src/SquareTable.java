class SquareTable extends Table {

    private double side;

    public SquareTable(int legs, String legsMat, String topMat, double side) {
        super(legs, legsMat, topMat);
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}
