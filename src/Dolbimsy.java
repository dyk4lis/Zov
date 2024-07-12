import java.io.FileInputStream;
import java.io.IOException;

public class Dolbimsy {
    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("C:\\Users\\dyk4l\\OneDrive\\Рабочий стол\\New folder\\text");

        int i;

        while((i = fis.read()) != -1){
            System.out.print((char)i);
        }
    }
}
