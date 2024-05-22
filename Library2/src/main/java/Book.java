public class Book {
    private final String title;
    private final String author;
    private final String id;
    private boolean isBorrowed;

    public Book(String title, String author, String id, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isBorrowed = isBorrowed;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getId() {
        return this.id;
    }
    public boolean isBorrowed() {
        return this.isBorrowed;
    }
    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}
