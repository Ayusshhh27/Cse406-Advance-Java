import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NIOFileReader {
  public static void main(String[] args) {
    String filePath = "C:\\Users\\say2a\\Desktop\\Advance Java\\unit-3\\NIO.2\\demo.txt";
    Path path = Paths.get(filePath);

    try {
      List<String> lines = Files.readAllLines(path);
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
