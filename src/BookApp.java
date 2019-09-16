public class BookApp {
    public static void main(String[] args) {
        BookDB db = new BookDB();
        Book book1 = db.getBook("Java1001");

        Book book2 = new Book();
        BookDB db2 = new BookDB("Java1001", book2);


    }
}
