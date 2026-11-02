package system;

import mode1.Book;
import mode1.LibraryMember;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void borrowBook(LibraryMember member, Book book) {

        if (!members.contains(member)) {
            System.out.println("Member is not registered.");
        } else if (!books.contains(book)) {
            System.out.println("Book does not belong to this library.");
        } else if (!book.isAvailable()) {
            System.out.println("Book is already borrowed.");
        } else {
            member.borrowBook(book);
            book.setAvailable(false);

            System.out.println(member.getName()
                    + " borrowed " + book.getTitle());
        }
    }

    public void returnBook(LibraryMember member, Book book) {

        if (!members.contains(member)) {
            System.out.println("Member is not registered.");
        } else if (!member.getBorrowedBooks().contains(book)) {
            System.out.println("This member has not borrowed this book.");
        } else {
            member.returnBook(book);
            book.setAvailable(true);

            System.out.println(member.getName()
                    + " returned " + book.getTitle());
        }
    }
}
