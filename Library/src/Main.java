
import mode1.Book;
import mode1.LibraryMember;
import system.Library;

public class Main {

    public static void main(String[] args) {

        System.out.println("Library Management System\n");

        // Create library
        Library library = new Library();

        // Create books
        Book book1 = new Book(
                "Harry Potter",
                "J.K. Rowling",
                "111"
        );

        Book book2 = new Book(
                "The Hobbit",
                "J.R.R. Tolkien",
                "222"
        );

        Book book3 = new Book(
                "The Great Gatsby",
                "F. Scott Fitzgerald",
                "333"
        );

        // Create members
        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println();

        // Add members to library
        library.addMember(member1);
        library.addMember(member2);

        System.out.println();

        //borrow books
        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);

        System.out.println();

        //try borrowing an already borrowed book
        library.borrowBook(member2, book1);

        System.out.println();

        //return a book
        library.returnBook(member1, book1);

        System.out.println();

        //borrow the returned book
        library.borrowBook(member2, book1);
    }
}
