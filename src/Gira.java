public class Gira {
    static class Calculator{

        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }
        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }
        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }
        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }




    }

    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 45;
        int b = 15;
        calculator.add(a, b);
        calculator.subtract(a, b);
        calculator.multiply(a, b);
        calculator.divide(a, b);
    }
}

