class thelast {
    public static void main(String[] args) {
        int [] x1={5,-4,0,10,20,-2,2,0,0,-8,0};
        int n=0;
        for(int i=x1.length-1; i>=0; i--)
        {
            if(x1[i]>=0) {n=n+1;}

            else  {   System.out.println("thelastneg = "+x1[i]);
                            System.out.println("i = "+i);
                                break;}

        }

        if(n==x1.length)  System.out.println("There is no negative");

    }
}