import java.io.File;
import java.util.Arrays;

public class DirectoryListing {
    public static void main(String[] args) {
        // Read directory path from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String dirPath = scanner.nextLine();
        scanner.close();

        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] filesAndDirs = directory.listFiles();

            if (filesAndDirs != null) {
                // Separate files and directories
                File[] files = Arrays.stream(filesAndDirs)
                        .filter(File::isFile)
                        .toArray(File[]::new);

                File[] dirs = Arrays.stream(filesAndDirs)
                        .filter(File::isDirectory)
                        .toArray(File[]::new);

                // Print file names first
                System.out.println("Files:");
                for (File file : files) {
                    System.out.println(file.getName());
                }

                // Print directory names next
                System.out.println("Directories:");
                for (File dir : dirs) {
                    System.out.println(dir.getName());
                }
            } else {
                System.out.println("The directory is empty or an error occurred.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}
