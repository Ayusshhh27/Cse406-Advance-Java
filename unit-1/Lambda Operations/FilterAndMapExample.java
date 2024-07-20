//Stream api - The Stream API in Java 8 provides a concise and functional way to process collections of data. It offers methods for filtering, mapping, and reducing elements, making data manipulation easier and more readable. 

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Chain multiple operations: filter even numbers and double them
        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .collect(Collectors.toList());

        // Print the result
        result.forEach(System.out::println);
    }
}