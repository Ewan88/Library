import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    public Library library;
    public Literature book1, book2;
    public Lender borrower1;

    @Before
    public void setup(){
        library = new Library(1);
        book1 = new Literature("The Borrowers", "Mr Borrower", "Borrowing");
        borrower1 = new Lender("Miss Lender");
        book2 = new Literature("The Wind & The Willows", "Some Dude", "Thriller");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void hasACapacity(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canLendBooks(){
        library.addBook(book1);
        library.lendBook(book1, borrower1);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower1.checkBooks());
    }


}
