
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BookTests {

    @Test
    public void BookWithNoAuthor() {
        boolean exceptionThrown = false;
        try {
            Book b = new Book("", "A");
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }

        assertTrue(exceptionThrown);
    }

    @Test
    public void BookWithNoTitle() {
        boolean exceptionThrown = false;
        try {
            Book b = new Book("A", "");
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }

        assertTrue(exceptionThrown);
    }

    @Test
    public void BookAuthorComparator() {
        Book b1 = new Book("A", "a");
        Book b2 = new Book("B", "Al");
        Book b3 = new Book("A", "Yu");

        List<Book> actual = new ArrayList<>();
        actual.add(b1);
        actual.add(b2);
        actual.add(b3);

        List<Book> expected = new ArrayList<>();
        expected.add(b1);
        expected.add(b3);
        expected.add(b2);

        actual.sort(new BookAuthorComparator(true));

        assertEquals(expected, actual);
    }


}
