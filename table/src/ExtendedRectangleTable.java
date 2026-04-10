class ExtendableRectangleTable extends RectangleTable {

    private double extraPartArea;

    public ExtendableRectangleTable(int legs,
                                    String legsMat,
                                    String topMat,
                                    double length,
                                    double width,
                                    double extraPartArea) {

        super(legs, legsMat, topMat, length, width);
        this.extraPartArea = extraPartArea;
    }

    public double getExtraPartArea() {
        return extraPartArea;
    }

    public double extendedArea() {
        return area() + extraPartArea;
    }
}