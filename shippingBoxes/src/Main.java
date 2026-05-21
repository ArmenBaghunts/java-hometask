public class Main {
    public static void main(String[] args) {


        Crate<String> c1 = new Crate<>();
        c1.pack("Apple");

        String s = c1.unpack();
        System.out.println(s);

        Crate<Car> c3 = new Crate<>();
        c3.pack(new Car("BMW"));

        Car car = c3.unpack();
        System.out.println(car.getName());
    }
}