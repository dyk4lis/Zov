import java.math.BigDecimal;

public class kumis {
    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal(0.1);
        BigDecimal pointOne = new BigDecimal(0.1);
        for (int i = 1; i <= 11; i++) {
            f1 = f1.add(pointOne);
            System.out.println(f1);
        }
    }
}


