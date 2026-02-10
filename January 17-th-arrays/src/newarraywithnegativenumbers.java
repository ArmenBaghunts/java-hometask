import java.util.ArrayList;
class newarray {
    public static void main(String[] args) {
        int [] x1={5,6,-7,10,20,-15,2,-4,0,-50,-33};
        ArrayList<Integer> x2 = new ArrayList<>();
        for(int i=0; i<x1.length; i++)
        {
            if(x1[i]<0) {x2.add(x1[i]);}
        }
        System.out.println(x2);
    }
}