public class didi {





    public static void main(String[] args) {
        JavarushQuest[] values = JavarushQuest.values();
        for (JavarushQuest javarushQuest : values) {
            System.out.println(javarushQuest.ordinal());
        }




        //напишите тут ваш код
    }
    public enum JavarushQuest {
        JAVA_SYNTAX,
        JAVA_CORE,
        JAVA_MULTITHREADING,
        JAVA_COLLECTIONS,
        CS_50,
        ANDROID,
        GAMES
    }

}
