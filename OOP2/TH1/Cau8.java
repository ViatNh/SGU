package OOP2.TH1;
import java.util.Scanner;

// Viết chương trình biện luận và giải phương trình bậc 1.

public class Cau8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--CHƯƠNG TRÌNH GIẢI PHƯƠNG TRÌNH BẬC NHẤT--");
        System.out.print("Nhập a và b: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm x = " + (-b / a));
        }

        sc.close();
    }
}
