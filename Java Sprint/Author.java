import java.awt.print.Book;
import java.util.List;

public class Author {
    private String name;
    private String dateOfBirth;
    private List<Book> booksWritten;

    // Constructors
    public Author(String name, String dateOfBirth, List<Book> booksWritten) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.booksWritten = booksWritten;
    }

    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Book> getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(List<Book> booksWritten) {
        this.booksWritten = booksWritten;
    }
}
