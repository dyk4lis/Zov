import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chitalka2 {
    public static void main(String[] args) {
        String src = "C:\\Users\\dyk4l\\OneDrive\\Рабочий стол\\text3.txt";
        String dest = "C:\\Users\\dyk4l\\OneDrive\\Рабочий стол\\text4.txt";



        try (FileReader input = new FileReader(src);
             FileWriter output = new FileWriter(dest)) {



            char[] buffer = new char[65536]; // 64Kb
            while (input.ready()) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


