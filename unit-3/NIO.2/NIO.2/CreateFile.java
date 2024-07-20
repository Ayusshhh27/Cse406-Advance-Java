import java.io.IOException;
import java.nio.file.*;

public class CreateFile {
    public static void main(String[] args) {
        Path filePath = Paths.get("example.txt");

        try {
            // Create the file
            Path path = Files.createFile(filePath);
            System.out.println("File created at: " + path.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
