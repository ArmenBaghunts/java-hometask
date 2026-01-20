class change {
    public static void main(String[] args) {
        int x[]={0,20,40,60,80,100,120,140};
        for(int i=0; i<x.length/2; i++)
        {
            int k=x[i];
            x[i]=x[x.length-1-i];
            x[x.length-1-i]=k;

        }
        for(int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }




    }
}