import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class fileio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get file name from user input
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        // Get content from user input
        System.out.print("Enter content: ");
        String content = scanner.nextLine();

        // Write content to the file
        writeFile(fileName, content);

        // Read content from the file
        String fileContent = readFile(fileName);
        System.out.println("Content read from file: " + fileContent);

        scanner.close();
    }

    public static void writeFile(String fileName, String content) {
        try {
            // Create a new file
            File file = new File(fileName);

            // Create a FileWriter object
            FileWriter writer = new FileWriter(file);

            // Write content to the file
            writer.write(content);

            // Close the writer
            writer.close();

            System.out.println("Content has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String readFile(String fileName) {
        StringBuilder fileContent = new StringBuilder();
        try {
            // Create a FileReader object
            FileReader reader = new FileReader(fileName);

            // Create a BufferedReader object
            BufferedReader bufferedReader = new BufferedReader(reader);

            // Read lines from the file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileContent.append(line);
            }

            // Close the reader
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return fileContent.toString();
    }
}
