package mode1;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int memberId;
    private ArrayList<Book> borrowedBooks;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
