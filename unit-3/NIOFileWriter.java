import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOFileWriter {
  public static void main(String[] args) {
    String filePath = "C:\\Users\\say2a\\Desktop\\Advance Java\\unit-2\\demo.txt";
    Path path = Paths.get(filePath);

    try {
      String content = "This is a file writing example in unit-2 folder.";
      Files.write(path, content.getBytes(), StandardOpenOption.CREATE);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
