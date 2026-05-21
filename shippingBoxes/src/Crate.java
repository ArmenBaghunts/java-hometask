public class Crate<T> {

    private T item;


    public void pack(T item) {
        this.item = item;
    }


    public T unpack() {
        return item;
    }
}