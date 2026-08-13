package OOP.TH1;
import java.util.Scanner;

// Viết chương trình biện luận và giải phương trình bậc 1.

public class Cau18 {
    public static void PTB1(float a, float b) {
        if (a != 0)
            System.out.print("Phuong trinh co nghiem x = " + -b/a);
        else {
            if (b == 0)
                System.out.println("Phuong trinh co vo so nghiem.");
            else
                System.out.println("Phuong trinh vo nghiem.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a, b;
        System.out.print("Phuong trinh bac nhat: ax + b = 0 \nNhap a va b: ");
        a = sc.nextFloat();
        b = sc.nextFloat();

        PTB1(a, b);
    }
}
