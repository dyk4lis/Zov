import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Dolbimsy2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\dyk4l\\OneDrive\\Рабочий стол\\New folder\\text");
        BufferedInputStream bis = new BufferedInputStream(fis,200);

        int i;
        while ((i=bis.read()) !=-1){
            System.out.print((char)i);
        }
    }
}
