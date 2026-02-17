import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter size of rows: M = ");
        int M = sc.nextInt();
        System.out.print ("Enter size of columns: N = ");
        int N = sc.nextInt();
        int[][] x=new int[M][N];
        int[] q=new int[N];

        System.out.println("Here are array elements ");
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++){
                x[i][j]=sc.nextInt();
            }
        }

        System.out.println();
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int temp=0;
        for(int i=0; i<M; i++){
            temp+=x[i][0];

        }
        System.out.println("temp = " + temp);

        int s=0;
        boolean t=true;

        for(int i=1; i<N; i++) {
            for(int j=0; j<M; j++){
                s=s+x[j][i];
            }

            System.out.println(s+", ");
            if(s==temp) {t=true;}
            else {t=false; break;}
            s=0;
        }

        if(t) {System.out.println("Yes. The sum of the elements of each column are equal.");}
        else {System.out.println("NO. The sum of the elements of each column are not equal.");}

        sc.close();
    }
}