import java.util.Calendar;
import java.util.Date;

public class Dni {


    static Date birthDate = new Date(102, Calendar.NOVEMBER, 17);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek((birthDate)));

    }

    static String getDayOfWeek(Date date) {
        String result = "";
        int day = date.getDay();
        switch (day) {

            case 0:
                return "Понедельник";
            case 1:
                return "Вторник";
            case 2:
                return "Среда";
            case 3:
                return "Четверг";
            case 4:
                return "Пятница";
            case 5:
                return "Суббота";
            case 06:
                return "Воскресенье";
        }
        return result;
    }
}



