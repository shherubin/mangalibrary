import java.nio.file.attribute.AttributeView;

public class Book {

        //Should these be camel case??
    private String Title;
    private String Author;
    private static boolean Availability;
    private int BookID;


    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        this.Title = title;
    }

    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        this.Author = author;
    }

    public boolean getAvailability() {
        return Availability;
    }
    public static boolean  setAvailability(boolean updateFlag) {
        Availability = updateFlag;
        return updateFlag;
    }

    public int getbookID() {
        return BookID;
    }

    public void setbookID(int bookID) {
        this.BookID = bookID;
    }
    public Book(String title, String author, boolean availability, int bookID) {
        this.Title = title;
        this.Author = author;
        this.Availability = availability;
        this.BookID = bookID;
    }
    @Override
    public String toString() {
        return Title + "written by " + Author + ", this book is " + Availability + "and has ID#" + BookID;
    }

}
