public class Main {
    public static void main(String[] args) {

        double[] arr = {100.0, 80.5, 50.0, 50.0, 20.0, 10.0};

        int index = BinarySearch.search(arr, 50.0);
        System.out.println("Index: " + index);

        int notFound = BinarySearch.search(arr, 99.0);
        System.out.println("Index: " + notFound);
    }
}