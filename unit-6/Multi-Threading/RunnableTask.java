public class RunnableTask implements Runnable {
  @Override
  public void run() {
    System.out.println("Runnable task running");
  }

  public static void main(String[] args) {
    Thread thread = new Thread(new RunnableTask());
    thread.start();
  }
}
