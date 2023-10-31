public class Book implements Borrowable {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int numberOfCopies;
    private Status status;

    // Constructors
    public Book(String title, Author author, String ISBN, String publisher, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
        this.status = Status.AVAILABLE;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Borrow and Return Logic

    public boolean borrowBook(int numberOfCopiesToBorrow) {
        if (status == Status.AVAILABLE && numberOfCopiesToBorrow <= numberOfCopies) {
            numberOfCopies -= numberOfCopiesToBorrow;
            status = Status.CHECKED_OUT;
            System.out.println(numberOfCopiesToBorrow + " copies of the book '" + title + "' have been borrowed.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
        return false;
    }


    public boolean returnBook(int numberOfCopiesToReturn) {
        if (status == Status.CHECKED_OUT) {
            numberOfCopies += numberOfCopiesToReturn;
            status = Status.AVAILABLE;
            System.out.println(numberOfCopiesToReturn + " copies of the book '" + title + "' have been returned.");
        } else {
            System.out.println("Invalid return operation: Book is not checked out.");
        }
        return false;
    }

    public boolean isEmpty() {
        return false;
    }
}

