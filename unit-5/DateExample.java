import java.time.LocalDate;

public class DateExample {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalDate specificDate = LocalDate.of(2024, 7, 20); // YYYY, MM, DD

    System.out.println("Today: " + today);
    System.out.println("Specific Date: " + specificDate);
  }
}
