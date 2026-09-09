package OOP2.TH1;
import java.util.Scanner;

// Viết chương trình nhập 2 số nguyên. In ra tổng, hiệu, tích, thương của chúng.

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 2 số nguyên: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %.2f\n", a, b, 1.0 * a / b);

        sc.close();
    }
}
