import java.util.ArrayList;
import java.util.List;

class Books {
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Books(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}

public class Library {
    private List<Books> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // add a book method
    public void addBook(String title, String author){
        books.add(new Books(title, author));
        System.out.println("Book added: " + title);
    }

    //display book method
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("Books in the library");
        for(Books book : books){
            if(book.isAvailable()) {
                System.out.printf("Title: %s, Author: %s%n",
                book.getTitle(), book.getAuthor());
            }
        }
    }

    // Borrow a book
    public void borrowBook(String title) {
        for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("You borrowed the book: " + title);
                return;
            } else if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Sorry, the book \"" + title + "\" is already borrowed.");
                return;
            }
        }
        System.out.println("The book \"" + title + "\" is not available in the library.");
    }

    // return a book
    public void returnBook(String title) {
        for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Thank you for returning the book: " + title);
                return;
            } else if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("The book\"" + title + "\" was not borrowed");
                return;
            }
        }
        System.out.println("The book \"" + title + "\" is not recognized in the library");
        return;
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook("To kill a Mockingbird", "Harper Lee");
        library.addBook("1984", "George Orwell");
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");

        // Display all books
        library.displayBooks();

        // Borrowing a book
        library.borrowBook("1984");

        // Display all books after borrowing
        library.displayBooks();

        // Returning a book
        library.returnBook("1984");

        // Display all books after returning
        library.displayBooks();
    }
}