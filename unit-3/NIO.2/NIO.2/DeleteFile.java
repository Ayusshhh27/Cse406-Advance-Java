import java.io.IOException;
import java.nio.file.*;

public class DeleteFile {
  public static void main(String[] args) {
    Path filePath = Paths.get("example.txt");

    try {
      // Delete the file
      Files.delete(filePath);
      System.out.println("File deleted successfully.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
