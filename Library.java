package in.ac.adit.pwj.miniproject.library;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private static final String FILE_NAME = "books.txt";

    public Library() {
        loadBooksFromFile();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        saveBooksToFile(); // Save to file whenever a book is added
    }

    // Synchronized method to borrow a book
    public synchronized void borrowBook(User user, String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println(user.name + " borrowed " + bookTitle);
                return;
            }
        }
        try {
            throw new BookNotAvailableException("Book " + bookTitle + " is not available.");
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }

    // Synchronized method to return a book
    public synchronized void returnBook(User user, String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println(user.name + " returned " + bookTitle);
                return;
            }
        }
        System.out.println("Book " + bookTitle + " was not borrowed.");
    }

    // Method to save the current book inventory to a file
    private void saveBooksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Book book : books) {
                writer.write(book.getTitle() + "," + book.isAvailable());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving books to file: " + e.getMessage());
        }
    }

    // Method to load the book inventory from a file
    private void loadBooksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String title = parts[0];
                    boolean isAvailable = Boolean.parseBoolean(parts[1]);
                    Book book = new Book(title);
                    book.setAvailable(isAvailable);
                    books.add(book);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading books from file: " + e.getMessage());
        }
    }
}