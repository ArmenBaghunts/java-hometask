import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Number of children: ");
        int numberofchildren = sc.nextInt();

        double price = 200;

        double discount1 = price * 20 / 100;
        double discount2 = price * 15 / 100;
        double discount3 = price * 25 / 100;
        double discount4 = price * 35 / 100;
        double discount5 = price * 50 / 100;

        double price1 = price - discount1;
        double price2 = price - discount2;
        double price3 = price - discount3;
        double price4 = price - discount4;
        double price5 = price - discount5;

        if (age > 0 && age < 120) {

            if (numberofchildren >= 0 && numberofchildren < 12) {

                if (age < 18 || age > 65) {
                    System.out.println("original price = " + price);
                    System.out.println("discount = " + discount1);
                    System.out.println("price = " + price1);

                } else {
                    if (numberofchildren > 5) {
                        System.out.println("original price = " + price);
                        System.out.println("discount = " + discount5);
                        System.out.println("price = " + price5);

                    } else if (numberofchildren == 5) {
                        System.out.println("original price = " + price);
                        System.out.println("discount = " + discount4);
                        System.out.println("price = " + price4);

                    } else if (numberofchildren == 4) {
                        System.out.println("original price = " + price);
                        System.out.println("discount = " + discount3);
                        System.out.println("price = " + price3);

                    } else if (numberofchildren == 3) {
                        System.out.println("original price = " + price);
                        System.out.println("discount = " + discount2);
                        System.out.println("price = " + price2);
                    }
                }

            } else {
                System.out.println("Your input value is invalid");
            }

        } else {
            System.out.println("Your input value is invalid");
        }

        sc.close();
    }
}

