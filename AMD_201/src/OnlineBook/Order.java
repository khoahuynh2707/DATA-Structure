package OnlineBook;

import java.util.List;

public class Order {
    String orderId;
    String customerName;
    String shippingAddress;
    List<Book> books;

    public Order(String orderId, String customerName, String shippingAddress, List<Book> books) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.books = books;
    }
}
