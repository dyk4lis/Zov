public class Inner1 {


    public static int countDigits(String string) {
        int j = 0;
        for (int i = 0; i < string.length() ; i++) {
            if(Character.isDigit(string.charAt(i))){

                j++;
            }
        }
        return j;


    }


    public static int countLetters(String string) {
        int j = 0;
        for (int i = 0; i < string.length() ; i++) {
            if(Character.isLetter(string.charAt(i))){

            j++;
            }
        }
        return j;


    }
    public static int countSpaces(String string) {
        int j = 0;
        for (int i = 0; i < string.length() ; i++) {
            if(Character.isWhitespace(string.charAt(i))){

                j++;
            }
        }
        return j;


    }

    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + Inner1.countDigits(string));
        System.out.println("Количество букв в строке : " + Inner1.countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }


}




