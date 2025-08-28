package OnlineBook;

import java.util.List;

public class Searching {
    // Binary Search implementation
    public static Order binarySearchById(List<Order> orders, String orderId) {
        int left = 0;
        int right = orders.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            Order midOrder = orders.get(mid);

            // Compare the middle element with the target
            if (midOrder.orderId.equals(orderId)) {
                return midOrder; 
            } else if (midOrder.orderId.compareTo(orderId) < 0) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return null; 
    }
}
