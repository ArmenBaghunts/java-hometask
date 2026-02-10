public class xndir3 {
    public static void main (String[] args){
        int [] x={-5,0,-10,9,10,12};
        for(int i=0; i<x.length; i++)
        {
            if (x[i]<0)
                continue;
            System.out.println(x[i]);
        }

        for(int i=0; i<x.length; i++)
        { if(x[i]>=x[i+1]) {i=i+1; System.out.println("error index = "+i); break;}
        else {System.out.println("OK");}
        }
    }
}