package in.ac.adit.pwj.miniproject.library;

public class Student extends User {
    public Student(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void borrowBook(Library library, String bookTitle) {
        library.borrowBook(this, bookTitle);
    }

    @Override
    public void returnBook(Library library, String bookTitle) {
        library.returnBook(this, bookTitle);
    }
}