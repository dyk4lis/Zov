import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Chara {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String result [] = new String[st.countTokens()];
        for (int i = 0; i < result.length ; i++) {
            result[i] = st.nextToken();

        }

        //напишите тут ваш код
        return result;
    }
}
