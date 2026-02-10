//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] x1 = {-5, -2, 6, 13, 5, 18, 125, 7, 99, 12, 11};
        int n = 0;
        for (int i = 0; i < x1.length; i++) {
            if ((x1[i] == 2 || x1[i] == 3 || x1[i] == 5 || x1[i] == 7) || (x1[i] != 1&&x1[i] % 2 != 0 && x1[i] % 3 != 0 && x1[i] % 5 != 0 && x1[i] % 7 != 0))

            {
                n++;
            }


        }
        System.out.println("n = " + n);

        int[] x2=new int[n];
        int temp=0;
        for (int i=0,k = 0; i < x1.length&&k<n; i++) {
            if ((x1[i] == 2 || x1[i] == 3 || x1[i] == 5 || x1[i] == 7) || (x1[i] != 1&&x1[i] % 2 != 0 && x1[i] % 3 != 0 && x1[i] % 5 != 0 && x1[i] % 7 != 0))
            {
                x2[k]=x1[i];
                System.out.println(x2[k]);
                k++;

            }
        }


    }
}
