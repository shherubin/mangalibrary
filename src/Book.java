public class Book {


    private String title;
    private String author;
    private boolean availability;
    private int bookId;

    public Book(){}

    public Book(String title, String author, boolean availability, int bookId) {
        this.title = title;
        this.author = author;
        this.availability = availability;
        this.bookId = bookId;
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

    public boolean getAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    @Override
    public String toString() {
        return title + " written by " + author + ", this book's availability is " + availability + " and has ID #" + bookId;
    }

}
