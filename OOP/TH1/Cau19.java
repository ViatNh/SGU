package OOP.TH1;
import java.util.Scanner;

// Viết chương trình biện luận và giải phương trình bậc 2.

public class Cau19 {
    public static void PTB2(double a, double b, double c) {
        double delta = b*b - 4*a*c;

        if (delta >= 0) {
            if (delta == 0)
                System.out.println("Phuong trinh co nghiem kep x = " + -b/(2*a));
            else {
                double x1, x2;
                x1 = (-b + Math.sqrt(delta)) /(2*a);
                x2 = (-b - Math.sqrt(delta)) /(2*a);
                System.out.printf("Phuong trinh co 2 nghiem phan biet\nx1 = %f\tx2 = %f", x1, x2);
            }
        }
        else
            System.out.println("Phuong trinh vo nghiem");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        System.out.print("Phuong trinh bac 2: ax^2 + bx + c = 0 \nNhap a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.print("\n");
        PTB2(a, b, c);
    }
}
