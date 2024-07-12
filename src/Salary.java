public class Salary {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));

    }

    public static String format(String name, int salary) {

        String phrase = "Меня зовут %s.Я буду зарабатывать $%d.";
        //напишите тут ваш код
        return String.format(phrase,name,salary);
    }
}


