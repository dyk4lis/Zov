public class Gavo {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.getName("Земля");
        earth.getAge(4_540_000_000L);
        earth.getSpeed(170_218);
        earth.getArea(510_072_000);
        earth.printInformation();
    }
}

     class Planet {
    private String name;
    private long age;
    private int speed;
    private int area;



    public void getName(String name){
        this.name = name;
    }
    public void getAge(long age){
        this.age = age;
    }
    public void getSpeed(int speed) {
        this.speed = speed;
    }
    public void getArea(int area) {
             this.area = area;
    }









        public void printInformation() {
            System.out.println("Имя планеты: " + name + ".");
            System.out.println("Возраст: " + age + " лет.");
            System.out.println("Орбитальная скорость: " + speed + " км/ч.");
            System.out.println("Общая площадь: " + area + " кв. км.");
        }
    }


