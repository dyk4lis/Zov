import java.util.Arrays;
import java.util.Scanner;


public class Hedgehog {



    public static void showWeather(City city) {
        City gorod = new City("tagan",7);


        System.out.println(String.format("В городе %s сегодня температура воздуха &d ", city.getName(),city.getTemperature()));
    }

    public static void main(String[] args) {
        City city = new City("Zhytomir", 23);
        showWeather(city);
    }





//напишите тут ваш код




    public static class City {
        private String name;
        private int temperature;

        public City(String name, int temperature) {
            this.name = name;
            this.temperature = temperature;
        }

        public String getName() {
            return name;
        }

        public int getTemperature() {
            return temperature;
        }
    }
    }











