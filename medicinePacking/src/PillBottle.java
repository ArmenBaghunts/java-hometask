public class PillBottle<T extends Medicine> {

    private T pill;

    public void pack(T pill) {
        this.pill = pill;
    }

   public T unpack() {
        return pill;
    }
}