import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class WriteToFile {
  public static void main(String[] args) {
    Path filePath = Paths.get("example.txt");
    List<String> lines = Arrays.asList("Hello, World!", "This is a test file.");

    try {
      // Write lines to the file
      Files.write(filePath, lines);
      System.out.println("File written successfully.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
