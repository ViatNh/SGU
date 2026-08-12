package OOP.TH1;
import java.util.Scanner;

// Câu 12. Viết chương trình in ra tổng
// S(n) = { 1 + 3 + 5 + ⋯ + n nếu n lẻ
//        { 2 + 4 + 6 + ⋯ + n nếu n chẵn
// Giá trị n được nhập vào từ bàn phím.

public class Cau12 {
    public static int sum(int n) {
        if (n <= 0) return 0;
        return n + sum(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        System.out.println("Tong: " + sum(n));
    }
}
