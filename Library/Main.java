package Library;

public class Main {
    public static void main(String[] args) {
        LibraryItem l1 = new LibraryItem();
        Book b1 = new Book();
        DVD d1 = new DVD();

        Magazine m1 = new Magazine();
        l1.returnItem();
        b1.checkout();
        d1.returnItem();
        m1.checkout();
    }
}
