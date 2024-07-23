
// ! ### Describing the Optional class:

// The Optional class in Java is a container object that may or may not contain a non-null value. It is used to represent a value that might be absent, thereby helping to avoid NullPointerException and making the code more readable and intentional.

// The `Optional` class helps avoid `NullPointerException` by providing a way to handle cases where a value might be absent. Instead of directly using `null` and risking exceptions, you use `Optional` to clearly represent the presence or absence of a value. If the value is not present, you can use methods like `orElse()` to provide a default or backup value. 

// - **With `Optional`**: You can check if a value is present or not.
// - **If Value is Present**: You can safely access it.
// - **If Value is Absent**: You can provide a backup value or handle the absence gracefully, avoiding `NullPointerException`.

// ! ### Describing lazy processing:

// Lazy processing (or lazy evaluation) is a programming technique where expressions are evaluated only when their results are needed. This optimizes performance by avoiding unnecessary calculations and saving memory. It also allows efficient handling of large or infinite data structures.

// Example in Programming:
// Consider a scenario where you have a large list of numbers and you want to filter out only the even numbers.

// Eager Evaluation: This would process the entire list and create a new list of even numbers immediately.
// Lazy Evaluation: This would define the filtering operation but only execute it when you actually access the elements.

import java.util.List;

public class Optionalandlazy {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(5, 8, 12, 3, 15, 20, 7);

    // Find the first number greater than 10 lazily
    Integer result = numbers.stream()
        .filter(num -> {
          System.out.println("Checking number: " + num);
          return num > 10;
        })
        .findFirst() // Terminal operation
        .orElse(null);

    System.out.println("Result: " + result);
  }
}

// 1. **Intermediate Operation**:
// - The `filter` operation is an intermediate operation. It filters the
// elements of the stream based on a condition (`num > 10`). However, it does
// not actually execute until a terminal operation is invoked.

// 2. **Terminal Operation**:
// - The `findFirst()` operation is a terminal operation. It triggers the
// execution of the filtering process defined by the `filter` operation and
// returns the first element that satisfies the condition. It terminates the
// stream and produces a final result.

// So, while `filter` is an intermediate operation that lazily evaluates the
// condition, `findFirst()` is a terminal operation that consumes the filtered
// stream and produces a result. Both operations work together to achieve lazy
// evaluation and efficient processing of data.