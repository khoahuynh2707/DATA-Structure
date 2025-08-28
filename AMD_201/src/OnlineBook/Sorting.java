package OnlineBook;

import java.util.ArrayList;
import java.util.List;


public class Sorting {
    public static void mergeSortByTitle(List<Book> books) {
        if (books.size() < 2) {
            return; 
        }

        int mid = books.size() / 2;
        List<Book> left = new ArrayList<>(books.subList(0, mid));
        List<Book> right = new ArrayList<>(books.subList(mid, books.size()));

        // Recursively sort both halves
        mergeSortByTitle(left);
        mergeSortByTitle(right);

        // Merge the sorted halves
        merge(books, left, right);
    }

    private static void merge(List<Book> books, List<Book> left, List<Book> right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right into the original list
        while (i < left.size() && j < right.size()) {
            if (left.get(i).title.compareTo(right.get(j).title) <= 0) {
                books.set(k++, left.get(i++));
            } else {
                books.set(k++, right.get(j++));
            }
        }

        // Copy remaining elements from left
        while (i < left.size()) {
            books.set(k++, left.get(i++));
        }

        // Copy remaining elements from right
        while (j < right.size()) {
            books.set(k++, right.get(j++));
        }
    }
}
