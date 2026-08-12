package OOP.TH1;
import java.util.Scanner;

// Câu 1. Viết chương trình nhập 2 số nguyên, xuất tổng, hiệu, tích, thương.

public class Cau1 {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int multi(int a, int b) {
        return a * b;
    }
    public static int devide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d + %d = %d\n", a, b, add(a, b));
        System.out.printf("%d - %d = %d\n", a, b, minus(a, b));
        System.out.printf("%d * %d = %d\n", a, b, multi(a, b));
        System.out.printf("%d / %d = %d", a, b, devide(a, b));
    }
}
