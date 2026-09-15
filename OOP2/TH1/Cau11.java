package OOP2.TH1;
import java.util.Scanner;

// Viết chương trình nhập số nguyên N. In ra các kết quả:
// - a. Các số tự nhiên <= N và tổng của chúng.
// - b. Các số tự nhiên chẵn <= N và tổng của chúng.
// - c. Các số tự nhiên lẻ <= N và tổng của chúng.
// - d. Các số tự nhiên là số nguyên tố <= N và tổng của chúng.
// - e. N số nguyên tố đầu tiên.

public class Cau11 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void a(int n) {
        int tong = 0;
        System.out.print("Các số tự nhiên <=N:");
        for (int i = 0; i <= n; i++) {
            tong += i;
            System.out.print(" " + i);
        }
        System.out.println("\nTổng: " + tong);
    }
    public static void b(int n) {
        int tongChan = 0;
        System.out.print("Các số tự nhiên chẵn <=N:");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                tongChan += i;
                System.out.print(" " + i);
            }
        }
        System.out.println("\nTổng: " + tongChan);
    }
    public static void c(int n) {
        int tongLe = 0;
        System.out.print("Các số tự nhiên lẻ <=N:");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                tongLe += i;
                System.out.print(" " + i);
            }
        }
        System.out.println("\nTổng: " + tongLe);
    }
    public static void d(int n) {
        int tongPrime = 0;
        System.out.print("Các số tự nhiên nguyên tố <=N:");
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                tongPrime += i;
                System.out.print(" " + i);
            }
        }
        System.out.println("\nTổng: " + tongPrime);
    }
    public static void e(int n) {
        int count = 0;
        System.out.print(n + " số nguyên tố:");
        for (int i = 0; count < n; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);
                count++;
            }
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opt, n;
        do {
            System.out.println("\n0. Thoát chương trình");
            System.out.println("1. Các số tự nhiên <= N và tổng của chúng.");
            System.out.println("2. Các số tự nhiên chẵn <= N và tổng của chúng.");
            System.out.println("3. Các số tự nhiên lẻ <= N và tổng của chúng.");
            System.out.println("4. Các số tự nhiên nguyên tố <= N và tổng của chúng.");
            System.out.println("5. Thoát chương trình");
            System.out.print("Nhập vào lựa chọn: ");
            opt = Integer.parseInt(sc.nextLine());
            
            if (opt == 0) {
                n = -1;
            }else {
                // nhập số nguyên N
                System.out.print("Nhập vào số nguyên N: ");
                n = Integer.parseInt(sc.nextLine());
            }

            switch (opt) {
                case 0 -> System.out.println("Chương trình đã thoát.");
                case 1 -> a(n);
                case 2 -> b(n);
                case 3 -> c(n);
                case 4 -> d(n);
                case 5 -> e(n);
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (opt != 0);

        sc.close();
    }
}
