public class LibraryMain {
    public static void main(String[] args) {

        //create books
        Book book1 = new Book(
                "Introduction to Java Programming",
                "John Smith", 2020);

        Book book2 = new Book(
                "Data Structures and Algorithms",
                "Jane Doe", 2018);

        Book book3 = new Book(
                "The Art of Fiction",
                "Alice Johnson", 2019);

        //create library
        Library library = new Library();

        //task 1: Add books and display catalog
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("TASK 1: LIBRARY CATALOG");
        library.displayBooks();

        System.out.println();
        library.findBooksByAuthor("Jane Doe");

        //task 2 and 3: Borrowing and availability
        System.out.println("\nTASK 2 AND 3: BORROWING");

        library.borrowBook("Introduction to Java Programming");

        System.out.println("Is the book available? "
                + library.isBookAvailable("Introduction to Java Programming"));

        library.returnBook(book1);

        System.out.println("Is the book available? "
                + library.isBookAvailable("Introduction to Java Programming"));

        //task 4: Ratings and reviews
        System.out.println("\nTASK 4: RATINGS AND REVIEWS");

        book1.setRating(4.5);
        book2.setRating(5.0);
        book3.setRating(3.5);

        book1.addReview("Very helpful book!");
        book1.addReview("Easy to understand.");
        book2.addReview("Excellent explanations!");
        book3.addReview("Interesting story.");

        System.out.println("Ratings and reviews added.");

        //task 5: Library statistics
        System.out.println("\nTASK 5: LIBRARY STATISTICS");

        System.out.println("Average book rating: "
                + library.getAverageBookRating());

        Book mostReviewed = library.getMostReviewedBook();

        if (mostReviewed != null) {
            System.out.println("Most reviewed book: "
                    + mostReviewed.getTitle());
        }

        //task 6: Library users
        System.out.println("\nTASK 6: LIBRARY USERS");

        User user1 = new User("Daniel", 22);
        User user2 = new User("Sarah", 25);

        library.addUser(user1);
        library.addUser(user2);

        library.displayUsers();

        //find a user
        User foundUser = library.findUser("Daniel");

        if (foundUser != null) {
            System.out.println("\nFound user: " + foundUser.getName());
        }

        //user borrows a book
        library.borrowBook(user1, "Data Structures and Algorithms");

        //show borrowed books
        user1.displayBorrowedBooks();

        //user returns a book
        library.returnBook(user1, "Data Structures and Algorithms");

        user1.displayBorrowedBooks();
    }
}
