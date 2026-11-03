import mode1.Book;
import mode1.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        System.out.println("Library Management System\n");

        Library library = new Library();

        Book book1 = new Book("Harry Potter", "J.K. Rowling", "111");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "222");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "333");

        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println();

        library.addMember(member1);
        library.addMember(member2);

        System.out.println("\n--- Book Reservations ---");

        // Alice reserves Harry Potter
        library.reserveBook(member1, book1);

        // Bob tries to reserve the same book
        library.reserveBook(member2, book1);

        System.out.println();

        //show Alice's reserved books
        library.displayReservedBooks(member1);

        System.out.println();

        // Alice cancels her reservation
        library.cancelReservation(member1, book1);

        System.out.println();

        // Bob can now reserve Harry Potter
        library.reserveBook(member2, book1);

        System.out.println();

        //show Bob's reserved books
        library.displayReservedBooks(member2);
    }
}