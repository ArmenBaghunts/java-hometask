class Book {
    private String title;
    private Author author;
    private static int pages;
    private int publishyear;
    private static double price;
    private static String genre;


    Book(String title, Author author, int publishyear) {
        this.title = title;
        this.author = author;
        this.publishyear = publishyear;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
       this.pages=pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price=price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre=genre;
    }

    public int getPublishyear() {
        return publishyear;
    }

    public void setPublishyear(int publishyear) {
        this.publishyear=publishyear;
    }


}









