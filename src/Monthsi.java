import java.util.Arrays;


public class Monthsi {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(Month.getSummerMonths()));

        HolidayReminder reminder = new HolidayReminder();
        reminder.printHolidays(Month.FEBRUARY);
    }

     enum Month{
         JANUARY("Январь", 31),
         FEBRUARY("Февраль", 28),
         MARCH("Март", 31),
         APRIL("Апрель", 30),
         MAY("Май", 31),
         JUNE("Июнь", 30),
         JULY("Июль", 31),
         AUGUST("Август", 31),
         SEPTEMBER("Сентябрь", 30),
         OCTOBER("Октябрь", 31),
         NOVEMBER("Ноябрь", 30),
         DECEMBER("Декабрь", 31);

         private String name;
         private int days
                 ;
         Month(String name,int days){
             this.name = name;
             this.days = days;
         }

         public static Month[] getWinterMonths(){
             return new Month[] {DECEMBER, JANUARY, FEBRUARY};
         }
         public static Month[] getSpringMonths(){
             return new Month[] {JANUARY, FEBRUARY, MARCH};
         }
         public static Month[] getSummerMonths(){
             return new Month[] {JANUARY, FEBRUARY, MARCH};
         }

         public String getName() {
             return name;
         }
         public int getDays() {
             return days;
         }
         public void setName(String name) {
             this.name = name;
         }
         public void setDays(int days) {
             this.days = days;
         }







    }
    public static class HolidayReminder {

        public void printHolidays(Month month) {

            switch (month) {

                case JANUARY:
                    System.out.println("7 января будет Рождество!");
                    break;
                case FEBRUARY:
                    System.out.println("В феврале празднуется День Защитника Отечества - 23 февраля!");
                    break;
                case MARCH:
                    System.out.println("В марте отмечается Всемирный Женский День - 8 марта!");
                    break;
            }
        }

    }


}
