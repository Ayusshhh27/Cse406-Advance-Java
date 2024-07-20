import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class OrganizeFilesByExtension {
  public static void main(String[] args) {
    // Define the directory to scan
    Path sourceDir = Paths.get("D:\\ke007"); // Change this to your directory

    try (Stream<Path> paths = Files.list(sourceDir)) {
      paths.forEach(path -> {
        if (Files.isRegularFile(path)) { // Process only files, not directories
          // Get the file name and extension
          String fileName = path.getFileName().toString();
          String[] tokens = fileName.split("\\.");
          String extension = tokens.length > 1 ? tokens[tokens.length - 1] : "no_extension";

          // Define the directory for the file extension
          Path extensionDir = sourceDir.resolve(extension);
          try {
            if (!Files.exists(extensionDir)) {
              // Create directory if it doesn't exist
              Files.createDirectory(extensionDir);
            }
            // Move the file to the new directory
            Path targetPath = extensionDir.resolve(fileName);
            Files.move(path, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Moved file: " + fileName + " to directory: " + extension);
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      });
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
