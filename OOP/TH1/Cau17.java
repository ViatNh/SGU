package OOP.TH1;
import java.util.Scanner;

public class Cau17 {
    public static void h1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j == 1) || (j == i) || (i == n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void h2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j == i) || (j == n) || (i == 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void h3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void h4(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j > n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap vao chieu cao n: ");
            n = sc.nextInt();
        } while (n <= 0);

        // h1(n);
        // h2(n);
        // h3(n);
        h4(n);
    }
}
