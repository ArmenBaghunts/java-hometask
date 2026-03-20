public class Main {
    public static void main (String args []) {
     Helper helper = new Helper();
     Author author1=new Author("Fyodor Dostoevski", 1821);
     Author author2=new Author("Leo Tolstoy", 1828);

     Book book1=new Book("The brothers Karamazovs", author1,1880);
     Book book2=new Book("The war and peace",author2,1869);
     Book book3=new Book("Resurrection",author2,1899);
     Book book4=new Book("The crime and punishment",author1,1866);
     Book book5=new Book("The Idiot",author1,1869);
     Book book6=new Book("Demons",author1,1872);
     Book [] x={book1,book2,book3,book4,book5,book6};

    Book [] result;
        result = helper.method4(x, "Fyodor Dostoevski");


        for (int i=0; i< result.length; i++) {
            if (result[i]!=null) {System.out.print(result[i].getTitle() + ", ");}
        }
    }
}
