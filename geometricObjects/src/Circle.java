class Circle extends Shape {
    private int r;

    public Circle(String color, int r) {
        super("Circle", color);
        this.r = r;
    }

    public int perimeter() {
        return (int)(2 * Math.PI * r);
    }

    public double area() {
        return Math.PI * r * r;
    }
}