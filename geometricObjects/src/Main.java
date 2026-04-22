class Main {
public static void main(String[] args) {

    Shape[] shapes = {
            new Square("green", 5),
            new Trapezium("blue", 4, 6, 5 ,10, 6.5),
            new Circle("red", 3),
            new Triangle("yellow", 3,4,5)
    };

    Shape max = shapes[0];

    for (int i=1; i<shapes.length; i++) {
        if (shapes[i].perimeter() > max.perimeter()) {
            max = shapes[i];
        }
    }

    System.out.println("Max perimeter = " + max.perimeter());
    System.out.println("Shape = " + max.getName());
}
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
