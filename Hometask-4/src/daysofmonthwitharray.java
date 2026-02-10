import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of month: ");
        int month = sc.nextInt();

        int monthDays [] = {31,28,31,30,31,30,31,31,30,31,30,31};


        if (month<1 || month>12) {
            System.out.println("Invalid month");
        } else {
            System.out.println("Days: " + monthDays[month-1]);
        }

        sc.close();
    }
}
