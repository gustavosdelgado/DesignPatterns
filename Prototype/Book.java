package Prototype;

public class Book {
    
    private String title;

    private String author;

    private int numberOfPages;

    public Book(Book book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.numberOfPages = book.getNumberOfPages();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

}
