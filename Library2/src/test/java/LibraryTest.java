import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class LibraryTest {
    private static final Book LORD_OF_THE_RINGS = new Book("Lord of the Rings", "J.R.R. Tolkien", "BK1", false);
    private static final Book TO_KILL_A_MOCKINGBIRD = new Book("To Kill a Mockingbird", "Harper Lee", "BK2", false);
    private static final Book A1984 = new Book("1984", "George Orwell", "BK3", false);
    private static final Book THE_GREAT_GATSBY = new Book("The Great Gatsby", "F. Scott Fitzgerald", "BK4", false);
    private static final Book HARRY_POTTER = new Book("Harry Potter", "J.K. Rowling", "BK5", false);
    private static final Book THE_CATCHER_IN_THE_RYE = new Book("The Catcher in the Rye", "J.D. Salinger", "BK6", false);
    private static final Book ECHOES_OF_THE_SILENCE = new Book("Echoes of the Silence", "Silvia Harper Lee", "BK7", false);
    private static final Book LORD_OF_THE_DANCE = new Book("Lord of the Dance", "Michael Lord", "BK8", false);

    private Library library = new Library();
    @Before
    public void initilised(){
        library.add(LORD_OF_THE_RINGS);
        library.add(TO_KILL_A_MOCKINGBIRD);
        library.add(A1984);
        library.add(THE_GREAT_GATSBY);
        library.add(HARRY_POTTER);
        library.add(THE_CATCHER_IN_THE_RYE);
        library.add(ECHOES_OF_THE_SILENCE);
        library.add(LORD_OF_THE_DANCE);
    }
    @Test
    public void searchBookUsingTitleOrIdOrAuthor(){
        List<Book> result = library.search("Harry Potter");
        assertSame("BK5",result.get(0).getId());
        result = library.search("BK");
        assertEquals(8,result.size());
        result = library.search("Lee");
        assertEquals(2,result.size());
        assertTrue(result.contains(TO_KILL_A_MOCKINGBIRD));
        assertTrue(result.contains(ECHOES_OF_THE_SILENCE));
        result =library.search("BK10");
        assertEquals(0, result.size());
    }
    @Test
    public void checkIsBookBorrowed(){
        List<Book> result = library.search("Harry Potter");
        assertEquals(false,result.get(0).isBorrowed());
    }
    @Test
    public void borrowBooks(){
        List<Book> borrowingBooks = library.borrow("Lord");
        assertEquals(2, borrowingBooks.size());
        assertTrue(borrowingBooks.get(0).isBorrowed());

    }

}
