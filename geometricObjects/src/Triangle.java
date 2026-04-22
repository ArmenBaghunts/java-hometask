class Triangle extends Shape {
    private int a, b, c;
    private final boolean rightTriangle;

    public Triangle(String color, int a, int b, int c) {
        super("Triangle", color);
        this.a = a;
        this.b = b;
        this.c = c;

        rightTriangle =
                a*a + b*b == c*c ||
                        a*a + c*c == b*b ||
                        b*b + c*c == a*a;
    }

    public boolean isRightTriangle() {
        return rightTriangle;
    }

    public int perimeter() {
        return a + b + c;
    }

    public double area() {
        double p = perimeter() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}