import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);

        LinkedList<Double> numbers2 = new LinkedList<>();
        numbers2.add(1.5);
        numbers2.add(2.5);
        numbers2.add(3.5);

        System.out.println(sum(numbers1)); // 60.0
        System.out.println(sum(numbers2)); // 7.5
    }

    public static double sum(List<? extends Number> list) {
        double result = 0;

        for (Number number : list) {
            result += number.doubleValue();
        }

        return result;
    }
}