public class Brosai {



    public static String errorMessage = "не повезло";

    public static void main(String[] args) throws Exception {
        try {
            generateLuckyNumber();
        }
        catch (Exception e) {
            System.out.println(errorMessage);
        }
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}


