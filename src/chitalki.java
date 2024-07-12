import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class chitalki {
    public static void main(String[] args) {
        String str = "C:\\Users\\dyk4l\\OneDrive\\Рабочий стол\\New Text Document.txt";

        try (FileReader in = new FileReader(str);
             BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {

                String line = reader.readLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

    }

}
