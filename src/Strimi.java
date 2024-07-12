import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Strimi {
    public static void main(String[] args) {


        try
                (FileReader fr = new FileReader("C:\\Users\\dyk4l\\OneDrive\\Рабочий стол\\text3.txt");
        Scanner sc = new Scanner(fr)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }




    }
}
