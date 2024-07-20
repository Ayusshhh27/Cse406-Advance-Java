import java.time.LocalTime;

public class TimeExample {
  public static void main(String[] args) {
    LocalTime now = LocalTime.now();
    LocalTime specificTime = LocalTime.of(15, 30); // HH, MM

    System.out.println("Current Time: " + now);
    System.out.println("Specific Time: " + specificTime);
  }
}
