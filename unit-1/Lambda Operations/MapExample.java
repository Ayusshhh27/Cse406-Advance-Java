
//Map- In Java's Stream API, the `map` operation transforms each element of a stream using a provided function and produces a new stream containing the transformed elements.

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Using map to square each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Printing the squared numbers
        System.out.println(squaredNumbers); // Output: [1, 4, 9, 16, 25]
    }
}