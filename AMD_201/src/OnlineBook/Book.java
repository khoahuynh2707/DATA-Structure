package OnlineBook;

public class Book {
    String title;
    String author;
    int quantity;
    double price;

    public Book(String title, String author, int quantity, double price) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
    }
    public Book(String title, String author, int quantity) {
        this(title, author, quantity, 0);
    }

    public String getPriceWithCurrency() {
        return String.format("%.2f USD", price);
    }
}
