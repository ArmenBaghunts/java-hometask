class xndir1 {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int s = 0;
        int array[] = {70, 5, 2, 10, 4, 25, 20, 7};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != i) {
                s = s + array[i];
            }
            if (s >= 100)
                break;

        }
        System.out.println("s = " + s);

    }
}