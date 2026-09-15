package OOP2.TH1;
import java.util.Scanner;

public class Cau13 {
    public static float tong(int n) {
        float tong = 2021;
        float giaithua = 1;
        for (int i = 2; i <= n; i++) {
            giaithua *= i;
            tong += Math.pow(-1, i) / giaithua;
        }
        return tong;
    }
    public static float tong(int x, int n) {
        float tong = 0;

        float giaithua = 1;
        for (int tmp = 2; tmp <= x; tmp++) giaithua *= tmp;

        for (int i = 1; i <= n; i++) {
            giaithua *= x + i;
            tong += Math.pow(x, i) / giaithua;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x, opt;
        do {
            System.out.println("\n0. Thoát chương trình");
            System.out.println("1. Câu a");
            System.out.println("2. Câu b");
            System.out.print("Lựa chọn: ");
            opt = Integer.parseInt(sc.nextLine());

            switch (opt) {
                case 0 -> System.out.println("Đã thoát chương trình.");
                case 1 -> {
                    System.out.print("Nhập n: ");
                    n = Integer.parseInt(sc.nextLine());
                    System.out.printf("S(%d) = %.2f\n", n, tong(n));
                }
                case 2 -> {
                    System.out.print("Nhập n: ");
                    n = Integer.parseInt(sc.nextLine());
                    do {
                        System.out.print("Nhập x (1 <= x <= 50): ");
                        x = Integer.parseInt(sc.nextLine());
                    } while (x < 1 || x > 50);
                    System.out.printf("S(%d) = %.2f\n", n, tong(x, n));
                }
            }
        } while (opt != 0);

        sc.close();
    }
}
