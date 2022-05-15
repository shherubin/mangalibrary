public class Book {
    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;
    private boolean availablity;
    private int bookID;

    public Book(String title, String author, boolean availability, int bookID) {
        this.title = title;
        this.author = author;
        this.availablity = availability;
        this.bookID = bookID;
    }
    @Override
    public String toString() {
        return title + "written by " + author + ", this book is " + availablity + "and has ID#" + bookID;
    }

}
