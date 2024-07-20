// Pipelining, in the context of programming, refers to the process of chaining
// together multiple operations in a sequence, where the output of one operation
// serves as the input for the next operation. Each operation typically
// transforms or processes the data in some way, and the entire sequence of
// operations forms a pipeline.

import java.util.Arrays;
import java.util.List;

public class PipelineExample {
    public static void main(String[] args) {
        // Define a list of strings
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "peach");

        // Pipeline to filter words starting with 'a', convert to uppercase, and print
        // them
        words.stream()
                .filter(word -> word.startsWith("a")) // Filter words starting with 'a'
                .map(word -> word.toUpperCase()) // Convert words to uppercase
                .forEach(System.out::println); // Print each word
    }
}
