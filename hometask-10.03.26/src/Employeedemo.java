public class Employeedemo {
    public static void main(String[] args) {
        Employee devop = new Developer();
        Employee manag = new Manager();

        devop.work();
        System.out.println();
        manag.work();
    }
}
