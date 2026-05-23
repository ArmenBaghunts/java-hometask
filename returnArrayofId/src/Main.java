//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <E extends Identifiable<R>, R> R[] createNewArray(E [] arr)  {
        R[] array = (R[]) new Object[arr.length];

        for (int i=0; i<arr.length; i++) {
            array[i]=arr[i].getID();
        }
        return array;
    }

    public static void main(String[] args) {
       Computers  [] ids = {new Computers(1, "Mac"), new Computers(2, "Samsung"),
                new Computers(3, "Beelink")};

        System.out.println(createNewArray(ids));


    }
}