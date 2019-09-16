public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;
    private String SKU;

    public Book() {

    }

//    public Book(BookDB bookDB, String SKU){
//        BookDB bookDB = new BookDB();
//
//    }


    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }


    public Book(String title, String author, String description, double price) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public Book(String SKU, String title, String author, String description, double price, boolean isInStock) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getDisplayText() {
        return title + " was written by " + author + "\n" + description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }
}
