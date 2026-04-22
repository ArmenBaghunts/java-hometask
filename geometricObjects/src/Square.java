class Square extends Shape {
    private int side;

    public Square(String color, int side) {
        super("Square", color);
        this.side = side;
    }

    public int perimeter() {
        return 4 * side;
    }

    public double area() {
        return side * side;
    }
}