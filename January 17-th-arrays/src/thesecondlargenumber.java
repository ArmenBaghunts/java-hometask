public class thesecondlargenumber {

public static void main(String[] args) {
    int[] x = {10, 127, 0, 45, 100, 9, 110, 7};
    int max = x[0];
    for (int i = 1; i < x.length; i++) {
        if (max > x[i]) {
            max = max;
        } else {
            max = x[i];
        }
    }
    System.out.println("max = " + max);
    //let's k is assigned with the second largest element
    int k = x[0];
    for (int i = 1; i < x.length; i++) {
        if (k > x[i] && k < max) {
            k = k;
        } else {
            k = x[i];
        }
    }
    System.out.println("k = " + k);
}
}
