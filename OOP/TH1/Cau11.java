package OOP.TH1;
import java.util.Scanner;

// Câu 11. Viết chương trình in ra tổng 1+2+3 +....+n với n được nhập từ bàn phím.

public class Cau11 {
    public static int sum(int n) {
        if (n <= 1) return 1;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        System.out.println("Tong: " + sum(n));
    }
}