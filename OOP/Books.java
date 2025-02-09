package OOP;

public class Books {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Prem","ASh",123);
        b1.borrowBook();
        b1.returnBook();
        b2.borrowBook();
        b2.returnBook();
        Book.getTotalBooks();
        System.out.println(b1.author+" "+b1.isbn+" "+b1.title);
        System.out.println(b2.author+" "+b2.isbn+" "+b2.title);
    }
}
