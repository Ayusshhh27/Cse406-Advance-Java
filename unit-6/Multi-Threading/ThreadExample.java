public class ThreadExample extends Thread {
  @Override
  public void run() {
    System.out.println("Thread running");
  }

  public static void main(String[] args) {
    Thread thread = new ThreadExample();
    thread.start();
  }
}
