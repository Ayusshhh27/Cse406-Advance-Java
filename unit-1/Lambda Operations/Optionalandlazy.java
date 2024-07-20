
// ! ### Describing the Optional class:

// Imagine you have a box. Sometimes the box has something inside, like a toy,
// and sometimes it's empty. The `Optional` class is like a special box that can
// either contain something or be empty.

// - **With Something Inside**: If there's something inside the `Optional` box,
// you can open it and get the thing out.
// - **Empty**: If the `Optional` box is empty, you know there's nothing inside.

// This helps Java programmers to deal with situations where they might or might
// not get a value from a method. Instead of getting a possibly dangerous "null"
// (like an empty box that might cause problems), they get an `Optional` box
// that clearly shows whether there's something inside or not.

// ! ### Describing lazy processing:

// Imagine you have a big list of chores to do, but you don't want to start
// until your friend comes over to help. Lazy processing is like waiting until
// your friend arrives before you start working on the chores.

// - **Not Doing Anything Yet**: You have all your chores written down on a
// list, but you don't start doing them until your friend arrives.
// - **Starting When Needed**: Once your friend arrives, you start working on
// the chores one by one, only when you need to. You don't do everything all at
// once.

// * */ In Java, lazy processing means that operations on streams (like lists of
// data) don't happen until you actually need the result. You set up what you
// want to do with the data, but it doesn't happen until you ask for the final
// result. This can make programs run more efficiently because they only do work
// when it's needed.

// * */ So, with `Optional`, you can safely handle situations where you might or
// might not have a value, and with lazy processing, you can make your programs
// more efficient by only doing work when necessary.

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
//    - The `filter` operation is an intermediate operation. It filters the elements of the stream based on a condition (`num > 10`). However, it does not actually execute until a terminal operation is invoked.

// 2. **Terminal Operation**:
//    - The `findFirst()` operation is a terminal operation. It triggers the execution of the filtering process defined by the `filter` operation and returns the first element that satisfies the condition. It terminates the stream and produces a final result.

// So, while `filter` is an intermediate operation that lazily evaluates the condition, `findFirst()` is a terminal operation that consumes the filtered stream and produces a result. Both operations work together to achieve lazy evaluation and efficient processing of data.