import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String []args){
        LinkedList<Buyer> list = new LinkedList<>();
        Buyer tvBuyer1= new Buyer("Grigor", "Grigoryan", "15-01-2026");
        Buyer tvBuyer2= new Buyer("Gevorg", "Harutyunyan", "15-01-2026");
        HashMap<HomeAppliances, LinkedList<Buyer>> hm= new HashMap<>();
        HomeAppliances tv=new HomeAppliances("TV", 2200, 220);
        hm.put(tv, list);
        list.add(tvBuyer1);
        list.add(tvBuyer2);
        System.out.println(hm.get(tv));

    }
}

