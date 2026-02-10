import java.util.Scanner;
class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Number: ");
        int n=sc.nextInt();

        int s=1;
        while(n>0) {
            s=s*n;
            n-=2;
        }
        System.out.println("factorial = "+s);
        sc.close();
    }
}