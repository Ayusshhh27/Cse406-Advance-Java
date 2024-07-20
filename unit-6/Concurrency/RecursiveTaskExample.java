import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class RecursiveTaskExample extends RecursiveTask<Integer> {
  private final int n;

  public RecursiveTaskExample(int n) {
    this.n = n;
  }

  @Override
  protected Integer compute() {
    if (n <= 1)
      return n;
    RecursiveTaskExample subTask1 = new RecursiveTaskExample(n - 1);
    RecursiveTaskExample subTask2 = new RecursiveTaskExample(n - 2);
    subTask1.fork();
    return subTask2.compute() + subTask1.join();
  }

  public static void main(String[] args) {
    try (ForkJoinPool pool = new ForkJoinPool()) {
      RecursiveTaskExample task = new RecursiveTaskExample(10);
      Integer result = pool.invoke(task);
      System.out.println("Result: " + result);
    }
  }
}
