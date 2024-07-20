import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(2024, 1, 1);
    LocalDate endDate = LocalDate.of(2024, 7, 20);
    Period period = Period.between(startDate, endDate);

    System.out.println("Period: " + period);
  }
}
