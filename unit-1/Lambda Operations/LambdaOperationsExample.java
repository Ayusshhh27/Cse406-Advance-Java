
// Sorting a stream, Saving results to a collection using the collect method
// Grouping and partition data using the Collectors class,

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaOperationsExample {
    public static void main(String[] args) {
        // Sample data
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Harry");

        // Sorting the names alphabetically
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);

        // Saving even-length names to a new list
        List<String> evenLengthNames = names.stream()
                .filter(name -> name.length() % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even-length names: " + evenLengthNames);

        // Grouping names by their lengths
        Map<Integer, List<String>> namesByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Names grouped by length: " + namesByLength);

        // Partitioning names into even and odd lengths
        Map<Boolean, List<String>> evenOddPartition = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() % 2 == 0));
        System.out.println("Names partitioned by even/odd length: " + evenOddPartition);
    }
}
