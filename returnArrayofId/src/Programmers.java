public class Programmers implements Identifiable<String> {
    private String id;
    String position;

   public Programmers(String id, String position) {
       this.id=id;
       this.position=position;
   }


   public  String getID(){
       return id;
   }

}
