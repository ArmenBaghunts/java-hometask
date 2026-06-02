public class Fruit implements Comparable<Fruit> {
    String name;
    String type;
    Integer weight;

    public Fruit(String name, String type, int weight) {
        this.name=name;
        this.type=type;
        this.weight=weight;
    }


   public int compareTo(Fruit o){
        if(this.type.compareTo(o.type)==0)
            {if (this.weight.compareTo(o.weight)==0)  return 0;}
        return -1;
    }
}

