//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static <T extends Comparable<T>> boolean isObjectInArray(T[] arr, T arg) {
        for (int i=0; i< arr.length; i++) {
            return (arg.compareTo(arr[i])==0);
        }
        return false;
    }

    public static void main(String[] args) {
        Fruit parcels[]={new Fruit("Parcel-1", "Orange", 2),
                new Fruit("Parcel-2", "Peach", 2),
                new Fruit("Parcel-3", "Orange", 3),
                new Fruit("Parcel-4", "Apple", 5),
                new Fruit("Parcel-5", "Orange", 2)};

        if(isObjectInArray(parcels, new Fruit("Parcel-1", "Orange", 6))) System.out.println("Yes. Such a type of parcel exists.");
        else System.out.println("No. Such a type of parcel does not exist.");

    }
}