
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
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


}
