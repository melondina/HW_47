public class Book {
    private String author;

    private String title;


    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        if (author == " " || author == "") {
            throw new IllegalArgumentException("There is no author");
        }
        if (title == " " || title == "") {
            throw new IllegalArgumentException("There is no title");
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }



    @Override
    public String toString() {
        return author + " " + title + ": ";
    }


}
