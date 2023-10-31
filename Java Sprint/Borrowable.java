public interface Borrowable {
    boolean borrowBook(int numberOfCopies);
    boolean returnBook(int numberOfCopies);
}
