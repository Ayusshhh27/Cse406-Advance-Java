import java.util.Locale;

public class LocaleExample {
  public static void main(String[] args) {
    Locale locale = Locale.getDefault();
    System.out.println("Default Locale: " + locale);

    Locale frLocale = Locale.FRENCH;
    System.out.println("French Locale: " + frLocale);
  }
}
