package OOP.TH1;
import java.util.Scanner;

// Câu 15. Viết chương trình tìm USCLN của 2 số nhập vào.

public class Cau15 {
    public static int UCLN(int a, int b) {
        int min = a < b ? a : b;
        for (int i = min; i > 0; i--)
            if ((a % i == 0) && (b % i == 0))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao 2 so: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("UCLN cua %d va %d la %d", a, b, UCLN(a, b));
    }
}
