
class point {
    public static void main(String[] args) {

        int arr [] ={1,2,8,7,5};

        int number = 0;

        for (int i=0; i<arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);

    }
}