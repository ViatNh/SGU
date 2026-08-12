package OOP.TH1;
import java.util.Scanner;

// Câu 6. Viết chương trình nhập số tự nhiên N, 
// kiểm tra và xuất kết quả N là số nguyên tố hay không.

public class Cau6 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap vao so tu nhien N: ");
            n = sc.nextInt();
        } while (n < 0);

        if (isPrime(n))
            System.out.printf("%d la so nguyen to", n);
        else
            System.out.printf("%d khong phai so nguyen to", n);
    }
}
