import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableExample implements Callable<Integer> {
  @Override
  public Integer call() throws Exception {
    return 123;
  }

  public static void main(String[] args) {
    CallableExample task = new CallableExample();
    FutureTask<Integer> futureTask = new FutureTask<>(task);
    Thread thread = new Thread(futureTask);
    thread.start();
    try {
      Integer result = futureTask.get(); // blocking call
      System.out.println("Result from Callable: " + result);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
