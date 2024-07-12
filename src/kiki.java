import java.util.Scanner;

public class kiki {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scan = new Scanner(System.in);
        boolean i = scan.nextBoolean();

        if (i == true) {
            glass = Math.ceil(glass);

        } else if (i == false) {
            glass = Math.floor(glass);
        } else {
            System.out.println("pick true or false");
        }

        System.out.println((int) glass);
        //напишите тут ваш код


    }
}

