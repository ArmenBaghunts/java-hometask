//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // the first point
        int l = 5140;
        int k1, k2, k3, k4;

        k4 = l % 10;
        k3 = ((l - k4) % 100) / 10;
        k2 = ((l - (10 * k3 + k4)) % 1000) / 100;
        k1 = l / 1000;
        System.out.print(k1 + ",");
        System.out.print(" " + k2 + ",");
        System.out.print(" " + k3 + ",");
        System.out.print(" " + k4 + ":");

        // the second point
        int a = 5, b = 6, c, d;
        c = a++;
        d = b++;
        System.out.print(" " + "c=" + c);
        System.out.print(", " + "a=" + a);
        System.out.print(", " + "d=" + d);
        System.out.print(", " + "b=" + b);

        int e, f;
        e = c--;
        f = d--;
        System.out.print(": " + "e=" + e);
        System.out.print(", " + "c=" + c);
        System.out.print(", " + "f=" + f);
        System.out.print(", " + "d=" + d + ":");

        // third point
        int int1 = 334344847, int2 = 15;
        long res3 = (long) int1 * int2;
        System.out.print(" " + "result=" + res3);
    }
}

