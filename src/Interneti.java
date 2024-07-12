import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class Interneti {


    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("https://javarush.com");
        InputStream input = null;
        try {
            input = url.openStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        byte[] buffer = null;
        try {
            buffer = input.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String str = new String(buffer);
        System.out.println(str);
}
}
