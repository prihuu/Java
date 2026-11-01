import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> availableBooks = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    //task 1: Add a book
    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            availableBooks.add(book);
        }
    }

    //task 1: Display all books
    public void displayBooks() {
        System.out.println("Library Catalog:");

        for (int i = 0; i < books.size(); i++) {
            System.out.print((i + 1) + ". ");
            books.get(i).displayBook();
        }
    }

    //task 1: Find books by author
    public void findBooksByAuthor(String author) {
        System.out.println("Books by Author \"" + author + "\":");

        boolean found = false;

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: \"" + book.getTitle()
                        + "\", Year: " + book.getPublicationYear());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found.");
        }
    }

    //task 2: borrow a book without associating it with a user
    public void borrowBook(String title) {
        Book book = findAvailableBook(title);

        if (book != null) {
            availableBooks.remove(book);
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    //task 2: Return a book
    public void returnBook(Book book) {
        if (books.contains(book) && !availableBooks.contains(book)) {
            availableBooks.add(book);
            System.out.println(book.getTitle() + " has been returned.");
        } else {
            System.out.println("This book cannot be returned.");
        }
    }

    //task 3: Check book availability
    public boolean isBookAvailable(String title) {
        return findAvailableBook(title) != null;
    }

    //task 5: Calculate average rating
    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Book book : books) {
            total += book.getRating();
        }

        return total / books.size();
    }

    //task 5: Find the book with the most reviews
    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewed = books.get(0);

        for (Book book : books) {
            if (book.getNumberOfReviews()
                    > mostReviewed.getNumberOfReviews()) {
                mostReviewed = book;
            }
        }

        return mostReviewed;
    }

    //task 6: Add a library user
    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    //task 6: Remove a library user
    public void removeUser(User user) {
        if (users.contains(user) && user.getBorrowedBooks().isEmpty()) {
            users.remove(user);
        } else {
            System.out.println("User cannot be removed.");
        }
    }

    //task 6: Find a user by name
    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }

        return null;
    }

    //task 6: Display all library users
    public void displayUsers() {
        System.out.println("Library Users:");

        for (User user : users) {
            System.out.println(user.getName() + ", Age: " + user.getAge());
        }
    }

    //task 6: Borrow a book through a user
    public void borrowBook(User user, String title) {
        if (!users.contains(user)) {
            System.out.println("User is not registered.");
            return;
        }

        Book book = findAvailableBook(title);

        if (book != null) {
            availableBooks.remove(book);
            user.borrowBook(book);
            System.out.println(user.getName()
                    + " borrowed " + book.getTitle() + ".");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    //task 6: Return a book through a user
    public void returnBook(User user, String title) {
        if (!users.contains(user)) {
            System.out.println("User is not registered.");
            return;
        }

        Book borrowedBook = null;

        for (Book book : user.getBorrowedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                borrowedBook = book;
                break;
            }
        }

        if (borrowedBook != null) {
            user.returnBook(borrowedBook);
            availableBooks.add(borrowedBook);
            System.out.println(user.getName()
                    + " returned " + borrowedBook.getTitle() + ".");
        } else {
            System.out.println(user.getName()
                    + " has not borrowed " + title + ".");
        }
    }

    //find an available book
    private Book findAvailableBook(String title) {
        for (Book book : availableBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }
}
