// The Stream API in Java 8 provides a concise and functional way to process
// collections of data. It offers methods for filtering, mapping, and reducing
// elements, making data manipulation easier and more readable.+

import java.util.Arrays;
import java.util.List;

public class StreamExample {
  public static void main(String[] args) {
    // Create a list of integers
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Use stream to filter even numbers and print them
    numbers.stream()
        .filter(num -> num % 2 == 0) // Filter even numbers
        .forEach(System.out::println); // Print each even number
  }
}
