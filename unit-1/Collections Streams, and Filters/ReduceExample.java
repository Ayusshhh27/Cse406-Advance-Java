import java.util.Arrays;
import java.util.List;

public class ReduceExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    // Calculate the sum of all numbers using reduce
    int sum = numbers.stream()
        .reduce(0, (acc, num) -> acc + num);
    System.out.println("Sum: " + sum);
  }
}
