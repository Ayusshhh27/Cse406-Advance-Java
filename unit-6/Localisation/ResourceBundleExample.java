import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
  public static void main(String[] args) {
    Locale locale = Locale.getDefault(); // or Locale.FRENCH
    ResourceBundle bundle = ResourceBundle.getBundle("Messages", locale);
    System.out.println(bundle.getString("greeting"));
  }
}
