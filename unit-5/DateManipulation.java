import java.time.LocalDate;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastMonth = today.minusMonths(1);

        System.out.println("Next Week: " + nextWeek);
        System.out.println("Last Month: " + lastMonth);
    }
}
