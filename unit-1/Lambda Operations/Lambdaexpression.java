// Definition-  Lambda expressions provide a concise way to achieve such tasks inline, often in just one line of code.

import java.util.ArrayList;
import java.util.List;

public class Lambdaexpression {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Iteration using lambda syntax
        numbers.forEach(number -> System.out.println(number));
    }
}


