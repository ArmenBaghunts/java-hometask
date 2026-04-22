public class Main {
    public static void main(String[] args) {

        Table table;
        table =
                new SquareTable(4, "wood", "glass", 2);
        System.out.println(table.area());

        table =
                new RectangleTable(4, "metal", "wood", 2, 3);
        System.out.println(table.area());

       table =
                new CircleTable(1, "metal", "glass", 1.5);
        System.out.println(table.area());

        table =
                new ExtendableRectangleTable(
                        4,"wood","wood",
                        2,3,
                        2
                );



        System.out.println(table.area());


    }
}