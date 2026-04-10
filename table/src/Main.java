public class Main {
    public static void main(String[] args) {

        SquareTable t1 =
                new SquareTable(4, "wood", "glass", 2);

        RectangleTable t2 =
                new RectangleTable(4, "metal", "wood", 2, 3);

        CircleTable t3 =
                new CircleTable(1, "metal", "glass", 1.5);

        ExtendableRectangleTable t4 =
                new ExtendableRectangleTable(
                        4,"wood","wood",
                        2,3,
                        2
                );

        System.out.println(t1.area());
        System.out.println(t2.area());
        System.out.println(t3.area());

        System.out.println("Closed area = " + t4.area());
        System.out.println("Extended area = " + t4.extendedArea());
    }
}