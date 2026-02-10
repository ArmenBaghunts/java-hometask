class Main {
    public static void main(String[] args) {
        int [] x={1,1,3,2,4,7,8,9,8};
        for(int i=1; i<x.length-1; i++)
        {
            if (x[i-1]==x[i+1])
            {System.out.println("i = "+i); break;}
            else {System.out.println("No mirror index");}
        }
    }
}