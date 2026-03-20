class Helper {
    Boolean method1(Book book) {
        return book.getPages() >400;
    }

   String method2(Book book) {
        return ("Duration of reading= "+3*book.getPages());
    }

    void method3(Book book) {
        System.out.print(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPublishyear());
    }



public  Book[] method4(Book [] booksInput, String authorname){
    Book [] booksResult=new Book[booksInput.length];
    int k=0;
    for (int i=0; i<booksInput.length; i++) {

        if(booksInput[i].getAuthor().getName().equals(authorname)) {booksResult[k++]=booksInput[i];}
    }

    return (booksResult);
}
}