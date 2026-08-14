package OOP.TH1;
import java.util.Scanner;

// Viết chương trình nhập vào 1 số nguyên n.
// - Phân tích n ra thừa số nguyên tố.
// - Cho biết n có bao nhiêu chữ số.

public class Cau21 {
    public static int thuaSNT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            while (n % i == 0)
                n /= i;
        return (n > 1) ? n : -1;
    }
    public static int countN(int n, int count) {
        if (n <= 0) return count;
        return countN(n / 10, ++count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();

        System.out.println("Thua so nguyen to cua n: " + thuaSNT(n));
        System.out.printf("%d co %d chu so", n, countN(n, 0));
    }
}