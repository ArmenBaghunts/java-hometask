public class Trapezium extends Shape {
    private int side1, side2, base1, base2;
    double height;
    double h;

    public Trapezium(String color, int side1, int side2, int base1, int base2, double height) {
        super("Trapezium", color);
        this.side1=side1;
        this.side2=side2;
        this.base1=base1;
        this.base2=base2;
        this.height=height;
    }

    public int perimeter() {
        return side1+side2+base1+base2;
    }

    public double area() {
        return height*(base1+base2)/2;
    }
}
