//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        int n=0;
        double s=30000;

        do {
            n++;
            s=s+s*25/100;
        } while(s<=100000);

        System.out.println("numberofmonths = "+n);
        System.out.println("final sum = "+s);
    }
}