import java.io.FileNotFoundException;

public class ThrowsExample {

    // Method that declares it might throw a checked exception
    // (FileNotFoundException)
    public static void readFile(String fileName) throws FileNotFoundException {
        if (!fileName.equals("example.txt")) {
            throw new FileNotFoundException("File not found exception");
        } else {
            System.out.println("File find: " + fileName);
            // Perform file reading operations here
        }
    }

    public static void main(String[] args) {
        String fileToRead = "test.txt"; // Change this to "example.txt" to see the expected output

        try {
            readFile(fileToRead);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }
    }
}
