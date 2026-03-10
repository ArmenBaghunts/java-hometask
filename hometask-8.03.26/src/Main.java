public class Main {
    public static void main (String args []) {
     Helper helper = new Helper();
     Book book1=new Book("The brothers Karamazovs",  "Fyodor Dostoevski",1880);
     Book book2=new Book("The war and peace","Leo Tolstoy",1869);
     Book book3=new Book("Resurrection","Leo Tolstoy",1899);
     Book book4=new Book("The crime and punishment","Fyodor Dostoevski",1866);
     Book book5=new Book("The Idiot","Fyodor Dostoevski",1869);
     Book book6=new Book("Demons","Fyodor Dostoevski",1872);
     Book [] x={book1,book2,book3,book4,book5,book6};

    Book [] result;
        result = Helper.method4(x,"Leo Tolstoy");


        for (int i=0; i< result.length; i++) {
            if (result[i]!=null) {System.out.print(result[i].getTitle() + ", ");}
        }
    }
}
