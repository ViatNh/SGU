package OOP2.TH1;
import java.util.Scanner;

// a. Viết hàm tính số Fibonacci thứ n.
// b. Viết hàm kiểm tra xem một số x có phải là số Fibonacci hay không.
// c. In ra màn hình n số Fibonacci đầu tiên.
// d. Tính tổng các số Fibonacci bé hơn m (với m nhập từ bàn phím).

public class Cau18 {
    public static int Fibo(int n) {
        if (n < 1) return 0;
        if (n == 1 || n == 2) return 1;
        return Fibo(n - 1) + Fibo(n - 2);
    }
    public static boolean isFibo(int x) {
        if (x < 0) return false;
        if (x == 0 || x == 1) return true;
        int a = 0, b = 1;
        while (b < x) {
            int tmp = a + b;
            b = a;
            a = tmp;
        }
        return b == x;
    }
    public static void numFibo(int n) {
        if (n < 1) return;
        for (int i = 0; i <= n; i++)
            System.out.print(Fibo(i) + " ");
    }
    public static long sumFibo(int m) {
        long tong = 0;
        for (int i = 1; tong < m; i++) {
            if (isFibo(i)) tong += Fibo(i);
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opt;
        do {
            System.out.println("\n0. Thoát chương trình");
            System.out.println("1. Tính số Fibonacci thứ n");
            System.out.println("2. Kiểm tra xem một số x có phải là số Fibonacci hay không");
            System.out.println("3. In ra màn hình n số Fibonacci đầu tiên");
            System.out.println("4. Tính tổng các số Fibonacci bé hơn m");
            System.out.print("Nhập lựa chọn: ");
            opt = Integer.parseInt(sc.nextLine());

            switch (opt) {
                case 0 -> System.out.println("Đã thoát chương trình.");
                case 1 -> {
                    System.out.print("Nhập n: ");
                    int n = Integer.parseInt(sc.nextLine());
                    System.out.printf("Fibo(%d) = %d\n", n, Fibo(n));
                }
                case 2 -> {
                    System.out.print("Nhập x: ");
                    int x = Integer.parseInt(sc.nextLine());
                    if (isFibo(x)) System.out.println(x + " là số Fibonacci");
                    else System.out.println(x + " không phải số Fibonacci");
                }
                case 3 -> {
                    System.out.print("Nhập n: ");
                    int n = Integer.parseInt(sc.nextLine());
                    System.out.println(n + " số Fibonacci đầu tiên: ");
                    numFibo(n);
                    System.out.println();
                }
                case 4 -> {
                    System.out.print("Nhập m: ");
                    int m = Integer.parseInt(sc.nextLine());
                    System.out.printf("Tổng các số Fibonacci bé hơn %d: %d", m, sumFibo(m));
                }
            }
        } while (opt != 0);

        sc.close();
    }
}
