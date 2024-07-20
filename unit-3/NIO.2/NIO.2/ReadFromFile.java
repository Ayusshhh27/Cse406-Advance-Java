import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ReadFromFile {
  public static void main(String[] args) {
    Path filePath = Paths.get("example.txt");

    try {
      // Read all lines from the file
      List<String> lines = Files.readAllLines(filePath);

      // Print each line
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
