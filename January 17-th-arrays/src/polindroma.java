import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("number: ");
        int number=sc.nextInt();

        int temp = number;
        int length = 0;
        int k=0;
// count digits
        while (temp > 0) {
            length++;
            temp /= 10;
        }

        int[] arr = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;

        }

        for (int i = 0; i <=length/2; i++) {
            if (arr[i]==arr[length-1-i]) k++;
        }

        if(k==length/2+1)  System.out.println("polyndrom");
        else System.out.println("not polyndrom");
        sc.close();
    }
}