public class book {
    private String title;
    private String author;
    private boolean availablity;

    public String getTitle() {
        return title;
    } public void setTitle(String title) {
        this.title = title;
    }

    public void getAuthor() {
        return String.author;
    } public void setAuthor(String author) {
        this.author = author;
    }

    public void getAvailability() {
        return boolean.availability;
    } public void setAvailability(boolean availability) {
        this.availablity = availability;
    }

    public book(String title, String author, boolean availability) {
        this.title = title;
        this.author = author;
        this.availablity = availability;
    }
    @Override
    public String toString() {
        return title + "written by " + author + ", this book is " + availablity;
    }

}
