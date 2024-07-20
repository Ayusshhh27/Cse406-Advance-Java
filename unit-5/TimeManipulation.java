import java.time.LocalTime;

public class TimeManipulation {
  public static void main(String[] args) {
    LocalTime now = LocalTime.now();
    LocalTime inTwoHours = now.plusHours(2);
    LocalTime minusFifteenMinutes = now.minusMinutes(15);

    System.out.println("In Two Hours: " + inTwoHours);
    System.out.println("Minus Fifteen Minutes: " + minusFifteenMinutes);
  }
}
