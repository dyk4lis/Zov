import java.util.Scanner;

public class Dika {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age");
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("sosi xyi");
        }
        System.out.println("ebat ti ded");
    }
}



