import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create library instance and add fake data
        Library library = new Library();

        // Adding  authors
        Author author1 = new Author("Jane Austen", "12/16/1775");
        Author author2 = new Author("William Shakespeare", "04/23/1564");
        Author author3 = new Author("George Orwell", "06/25/1903");
        Author author4 = new Author("Emily Dickinson", "12/10/1830");
        Author author5 = new Author("Mark Twain", "11/30/1835");
        // Add more fake authors...

        // Adding books
        Book book1 = new Book("Pride and Prejudice", author1, "ISBN12345", "Publisher X", 10);
        Book book2 = new Book("Sense and Sensibility", author1, "ISBN67890", "Publisher Y", 8);
        // Add more fake books...

        // Adding authors and books to the library
        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addBook(book1);
        library.addBook(book2);
        // Add more authors and books...

        // Adding  patrons
        Patron patron1 = new Patron("Bob Jenkins", "Address 1", "123-456-7890");
        Patron patron2 = new Patron("Joe Smith", "Address 2", "987-654-3210");
        // Add more fake patrons...

        // Adding patrons to the library
        library.addPatron(patron1);
        library.addPatron(patron2);
        // Add more patrons...
        System.out.println("Patron Information:");
        for (Patron patron : library.getPatrons()) {
            System.out.println("Name: " + patron.getName());
            System.out.println("Address: " + patron.getAddress());
            System.out.println("Phone Number: " + patron.getPhoneNumber());
            System.out.println("Borrowed Books: " + patron.getBorrowedBooks());
            System.out.println("--------------------------");
        }
        // Testing library management system features
        // Testing library management system features
        System.out.println("Searching for a book by title:");
        Book foundBookByTitle = library.searchBookByTitle("Pride and Prejudice");
        if (foundBookByTitle != null) {
            System.out.println("Book found: " + foundBookByTitle.getTitle());
            System.out.println("Author: " + foundBookByTitle.getAuthor().getName());
            // Print other details if needed
        } else {
            System.out.println("Book not found.");
        }


        System.out.println("\nSearching for books by author:");
        List<Book> foundBooksByAuthor = library.searchBooksByAuthor("Jane Austen");
        if (!foundBooksByAuthor.isEmpty()) {
            for (Book book : foundBooksByAuthor) {
                System.out.println("Book found: " + book.getTitle());
            }
        } else {
            System.out.println("No books found for the author.");
        }

        System.out.println("\nBorrowing a book:");
        library.borrowBook(patron1, book1, 2);
        System.out.println("Number of copies of Book 1 after borrowing: " + book1.getNumberOfCopies());
        System.out.println("Books borrowed by Patron 1:");
        for (Book book : patron1.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }

        System.out.println("\nReturning a book:");
        library.returnBook(patron1, book1, 1);
        System.out.println("Number of copies of Book 1 after returning: " + book1.getNumberOfCopies());
        System.out.println("Books borrowed by Patron 1 after returning:");
        for (Book book : patron1.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
