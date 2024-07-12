import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dolbimsy3 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String line = br.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < line.length() ; i++) {
                if(i % 2 == 0){
                    System.out.print(String.valueOf(chars[i]).toUpperCase());

                }
                if(i % 2 != 0){
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }

            }



        }

    }
}
