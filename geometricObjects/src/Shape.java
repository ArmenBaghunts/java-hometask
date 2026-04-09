class Shape {
    private final String name;
    private final String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int perimeter() {
        return 0;
    }

    public double area() {
        return 0;
    }
}