import java.time.Instant;

public class TimestampExample {
  public static void main(String[] args) {
    Instant now = Instant.now();
    Instant specificTimestamp = Instant.parse("2024-07-20T15:30:00Z");

    System.out.println("Current Timestamp: " + now);
    System.out.println("Specific Timestamp: " + specificTimestamp);
  }
}
