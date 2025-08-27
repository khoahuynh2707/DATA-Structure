package OnlineBook;

import java.util.List;


public class Searching {
    public static Order searchOrderById(List<Order> orders, String orderId) {
        for (Order order : orders) {
            if (order.orderId.equals(orderId)) {
                return order;
            }
        }
        return null;
    }
}
