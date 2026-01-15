//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // point-1
        int a = 14;
        if (a >= 18 && a <= 65)
            System.out.println("Allowed");
        else System.out.println("Not allowed");

        // point-2
        boolean hasTicket = false;
        boolean hasInvitation = true;
        if (hasTicket || hasInvitation)
            System.out.println("Permit");
        else System.out.println("Don't Permit");

        // point-3
        int d = 2, b = -10, c = 7;
        if (d > 0 && b > 0 || b > 0 && c > 0 || c > 0 && d > 0)
            System.out.println("Yes");
        else System.out.println("No");


        // point-4
        int k1 = 5, k2 = 6, k3;
        k3 = k1 | k2;
        System.out.println("k1=" + k1);
        System.out.println("k2=" + k2);
        System.out.println("k3=" + k3);

        // point-5
        int a1 = 12, a2 = 12;
        if (a1 > a2) System.out.println(a1);
        if (a2 > a1) System.out.println(a2);
        if (a1 == a2) {
            System.out.println("Equal");
        }

        // point-6
        int g = 100;
        if (g > 0 && g <= 100) {
            if (g > 0 && g <= 49) {
                System.out.println("Fail");
            } else if (g >= 50 && g <= 69) {
                System.out.println("Average");
            } else if (g >= 70 && g <= 89) {
                System.out.println("Good");
            } else if (g >= 90 && g <= 100) {
                System.out.println("Excellent");
            }
        }

        else System.out.println("Write precise grade");

    // point-7
    int b1=1;
    int b2=0;
    int result=b1^b2;
    boolean t=(result==0);
    if (t==true) System.out.println("Same"); else System.out.println("Different");

    // point-8
    int n=88;
    if ((n & 1) == 0) System.out.println("Even"); else System.out.println("Odd");

    }

}