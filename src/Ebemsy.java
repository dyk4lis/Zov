import java.io.*;
import java.nio.file.Path;


public class Ebemsy {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("C:\\Users\\dyk4l\\OneDrive\\Рабочий стол\\New folder\\text");
        FileOutputStream fis = new FileOutputStream(file.toFile(),true);
        String greetings = "Привет! Добро пожаловь в gym \n";
        fis.write(greetings.getBytes());
        fis.close();
    }
}
