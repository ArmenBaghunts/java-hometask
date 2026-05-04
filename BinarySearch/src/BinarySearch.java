public class BinarySearch {

    public static int search(double[] arr, double target) {
        validate(arr);
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(double[] arr, double target, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // IMPORTANT: array is sorted DESCENDING
        if (target > arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }

    private static void validate(double[] arr) {
        for (double num : arr) {
            if (num < 0) {
                throw new NegativeNumberException("Array contains negative number: " + num);
            }
        }
    }
}