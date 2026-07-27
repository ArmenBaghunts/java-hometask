public class Order {
    int id;
    String itemName;

 public Order (int id, String itemName)  {
     this.id=id;
     this.itemName=itemName;
 }

public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass())
        return false;

    Order other = (Order) o;
    return id == other.id;

    }

    public int hashCode(){
     return id;
    }

}
