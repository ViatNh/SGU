package OOP2.TH1;

import java.util.Scanner;

// Viết chương trình biện luận và giải phương trình bậc 2.

public class Cau9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(-b, 2) - (4 * a * c);

        if (delta <= 0) {
            if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép x = " + (-b /(2 * a)));
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            System.out.println("x1 = " + ((-b + Math.sqrt(delta)) /(2 * a)));
            System.out.println("x2 = " + ((-b - Math.sqrt(delta)) /(2 * a)));
        }

        sc.close();
    }
}
