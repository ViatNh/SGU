package OOP.TH1;
import java.util.Random;

public class Cau24 {
    public static void main(String[] args) {
        int min = 65;
        int max = 80;

        Random r = new Random();
        int i1 = r.nextInt(max - min + 1) + min;
        int i2 = r.nextInt(max);

        System.out.println(i1);
        System.out.print(i2);
    }
}
