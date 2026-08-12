package OOP.TH1;
import java.util.Scanner;

// Câu 7. Viết chương trình nhập số tự nhiên N, xuất kết quả:
// a. Các số tự nhiên <=N và tổng của chúng
// b. Các số tự nhiên chẵn <=N và tổng của chúng
// c. Các số tự nhiên lẻ <=N và tổng của chúng
// d. Các số tự nhiên là số nguyên tố <=N và tổng của chúng
// e. N số nguyên tố đầu tiên

public class Cau7 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    public static void sum(int n) {
        int s = 0;
        System.out.print("Cac so tu nhien <= N: ");
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d ", i);
            s += i;
        }
        System.out.println("| Tong: " + s);
    }
    public static void sumEven(int n) {
        int s = 0;
        System.out.print("Cac so tu nhien chan <= N: ");
        for (int i = 0; i <= n; i += 2) {
            System.out.printf("%d ", i);
            s += i;
        }
        System.out.println("| Tong: " + s);
    }
    public static void sumOdd(int n) {
        int s = 0;
        System.out.print("Cac so tu nhien le <= N: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.printf("%d ", i);
            s += i;
        }
        System.out.println("| Tong: " + s);
    }
    public static void sumPrime(int n) {
        int s = 0;
        System.out.print("Cac so nguyen to <= N: ");
        for (int i = 2; i <= n; i++)
            if (isPrime(i)) {
                System.out.printf("%d ", i);
                s += i;
            }
        System.out.println("| Tong: " + s);
    }
    public static void e(int n) {
        int i = 1;
        int count = 0;
        System.out.print("N số nguyên tố đầu tiên: ");
        while (count < n) {
            if (isPrime(++i)) {
                System.out.printf("%d ", i);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap vao so tu nhien N: ");
            n = sc.nextInt();
        } while (n < 0);

        System.out.print("\n");
        sum(n);
        sumEven(n);
        sumOdd(n);
        sumPrime(n);
        e(n);
        System.out.print("\n");
    }
}