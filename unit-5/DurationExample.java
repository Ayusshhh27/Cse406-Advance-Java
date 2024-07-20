import java.time.LocalTime;
import java.time.Duration;

public class DurationExample {
  public static void main(String[] args) {
    LocalTime startTime = LocalTime.of(14, 0);
    LocalTime endTime = LocalTime.of(16, 30);
    Duration duration = Duration.between(startTime, endTime);

    System.out.println("Duration: " + duration);
  }
}
