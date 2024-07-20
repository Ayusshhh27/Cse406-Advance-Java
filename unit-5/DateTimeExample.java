import java.time.LocalDateTime;

public class DateTimeExample {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime specificDateTime = LocalDateTime.of(2024, 7, 20, 15, 30);

    System.out.println("Current DateTime: " + now);
    System.out.println("Specific DateTime: " + specificDateTime);
  }
}
