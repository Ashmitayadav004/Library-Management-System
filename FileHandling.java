import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class FileHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the file name");
        String filename = sc.nextLine();
        try (FileReader reader = new FileReader(filename)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }

        } catch (FileNotFoundException exception) {
            System.out.println("File is not in the folder");
        } catch (IOException exception) {
            System.out.printf("Error ", exception.getMessage());
        }
    }
}
