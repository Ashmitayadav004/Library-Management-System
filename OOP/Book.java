package OOP;

public class Book {
    static int totalBooks;
    String title;
    String author;
    int isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Book() {
        title = "ABC";
        author = "Hardik";
        isbn = 123;
    }

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public static void getTotalBooks() {
        System.out.println(totalBooks);
    }

    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Borrow book");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("return book");
        } else {
            System.out.println("This book is already in the library");
        }

    }

}
