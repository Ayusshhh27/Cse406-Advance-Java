import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
  public static void main(String[] args) {
    // Set the locale to Spanish
    @SuppressWarnings("deprecation")
    Locale locale = new Locale("es", "ES");
    // Load the resource bundle for the specified locale
    ResourceBundle bundle = ResourceBundle.getBundle("Messages", locale);
    // Get and print the greeting message from the resource bundle
    System.out.println(bundle.getString("greeting"));
  }
}
