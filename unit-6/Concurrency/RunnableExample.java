public class RunnableExample implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread running using Runnable");
  }

  public static void main(String[] args) {
    RunnableExample task = new RunnableExample();
    Thread thread = new Thread(task);
    thread.start();
  }
}
