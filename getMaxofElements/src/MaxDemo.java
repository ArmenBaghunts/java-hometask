//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MaxDemo {
    static <T extends Comparable<T>> T getMax(T[] x) {
       T max=x[0];
        for (int i=1; i<x.length; i++) {
            if(x[i].compareTo(max)>0) {max=x[i];}
        }
        return max;
    }
    public static void main(String[] args) {
        Houses houses [] = {new Houses(90,4, "First house"),new Houses(80,3, "Second house"), new Houses(50,2, "Third house")};
       Houses m = getMax(houses);
        System.out.println("The largest is the "+m.name);
    }


}