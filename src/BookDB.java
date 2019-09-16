import java.util.ArrayList;
import java.util.List;

public class BookDB {

    private Book book;
    private List<Book> books;

    public BookDB() {
        books = new ArrayList<>();
        books.add(new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50, true));
        books.add(new Book("Java1002", "Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00, true));
        books.add(new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45.00, true));
        books.add(new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50, true));
        books.add(new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, false));
        books.add(new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true));
    }

    public BookDB(String SKU) {
        this();
        this.book = getBook(SKU);
    }

    public BookDB(String SKU, Book book) {
        this();
        book = getBook(SKU);
    }

    public Book getBook(String SKU) {
        for (Book book: books) {
            if (SKU.equalsIgnoreCase((book.getSKU()))) {
                this.book = book;
                break;
            }
        }
        return book;
    }
    public List<Book> getBooks(){
        return books;
    }
    public void setBooks (List<Book> books) {
        this.books = books;
    }
}
