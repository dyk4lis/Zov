import java.util.Arrays;

public class testim {

    public static void main(String[] args) {



        System.out.println(DayOfWeek.valueOf("FRIDAY"));





    }
    public enum DayOfWeek {

        SUNDAY("Воскресенье"),
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота");

        private String Day;

        DayOfWeek(String day) {
            this.Day = day;
        }

        public String toString() {
            return "День недели: " + Day;
        }


    }
    }
