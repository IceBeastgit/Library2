import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    public List<Book> search(String searchString){
        List<Book> matchingBooks = new ArrayList<>();
        for (Book b: books){
            if ((b.getTitle().toUpperCase().contains(searchString.toUpperCase()))
                    ||(b.getAuthor().toUpperCase().contains(searchString.toUpperCase()))
            ||(b.getId().toUpperCase().contains(searchString.toUpperCase()))) {
                matchingBooks.add(b);
            }
        }
        return matchingBooks;
    }
    public void add(Book book){
        books.add(book);
    }
    public List<Book> borrow(String searchString){
        List<Book> borrowingBooks = new ArrayList<>();
        for (Book b: books){
            if ((b.getTitle().toUpperCase().contains(searchString.toUpperCase()))
                    ||(b.getAuthor().toUpperCase().contains(searchString.toUpperCase()))
                    ||(b.getId().toUpperCase().contains(searchString.toUpperCase()))) {
                b.setBorrowed(true);
                borrowingBooks.add(b);
            }

        }
        return borrowingBooks;
    }
}
