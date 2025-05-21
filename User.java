package in.ac.adit.pwj.miniproject.library;

public abstract class User {
    protected String name;
    protected String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId; 
    }

    public abstract void borrowBook(Library library, String bookTitle);
    public abstract void returnBook(Library library, String bookTitle);
}