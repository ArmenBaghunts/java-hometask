public class Computers  implements Identifiable <Integer> {
    private Integer id;
    String model;

    public Computers(Integer id, String model) {
        this.id=id;
        this.model=model;
    }

    public  Integer getID() {
        return id;
    }
}