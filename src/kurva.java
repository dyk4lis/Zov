public class kurva {
    public static void main(String[] args) {





        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около" + " " + SolarSystem.age + ".");
        System.out.println("В Солнечной системе" + " " + SolarSystem.planetsCount + " " + "известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из" + " " + SolarSystem.starsCount + " " +"звезды.");
        System.out.println("Звезды по имени " + SolarSystem.starName + ".");
        System.out.println("Расстояние к центру галактики составляет" + "." + SolarSystem.galacticCenterDistance + "." + "световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");



        }
    }
    class SolarSystem {

        public static final long age = 4_568_200_000L;

        public static final int planetsCount = 8;

        public static int starsCount = 1;

        public static String starName = "Солнце";

        public static int galacticCenterDistance = 27170;

    }










