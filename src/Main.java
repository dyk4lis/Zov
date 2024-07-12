import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        while (scan.hasNextInt()) {
            int i = scan.nextInt();
            if (i < min) {
                secondMin = min;
                min = i;
            } else if (i > min && i < secondMin) {
                secondMin = i;
            }


            //напишите тут ваш код

        }
        System.out.println(secondMin);
    }
}
