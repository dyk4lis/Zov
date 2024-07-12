import java.util.Scanner;


public class chcha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (scan.hasNextInt()) {
                int num1 = scan.nextInt();
                sum = sum + num1;
            } else if (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.equals("ENTER")) {
                    isExit = true;
                    System.out.println(sum);
                }


            }
        }
    }
}