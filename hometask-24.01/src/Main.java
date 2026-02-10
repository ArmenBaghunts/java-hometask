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
        int s=0;


        System.out.println("Here are array elements ");
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++){
                x[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Here are the view of the matrix after replacing rows with columns");

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++){
                System.out.print(x[j][i] + " ");
                s=s+x[j][i];

            }
            System.out.println();
            q[i]=s;
            s=0;
        }
        System.out.println();


        for(int i=0; i<N; i++){
            System.out.print(q[i] + ", ");
        }

        System.out.println();

        boolean t=false;
        for(int i=1; i<N; i++){

            if ( q[i]==q[i-1]) {t=true;}
            else {t=false; break;  }
        }

        if(t) {System.out.print("Yes.The sum of the elements of each column are equal.");}
        else {System.out.print("NO.The sum of the elements of each column are not equal.");}




        sc.close();
    }
}