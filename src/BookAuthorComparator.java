
import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {

    private final boolean ignoreCase;

    public BookAuthorComparator(boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
    }

    @Override
    public int compare(Book o1, Book o2) {
        String author1 = o1.getAuthor();
        String author2 = o2.getAuthor();
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();

        if (ignoreCase) {
            author1 = author1.toLowerCase();
            author2 = author2.toLowerCase();
            title1 = title1.toLowerCase();
            title2 = title2.toLowerCase();

        }
        if(!author1.equals(author2)) {
            return author1.compareTo(author2);
        }
        return title1.compareTo(title2);
    }
}
