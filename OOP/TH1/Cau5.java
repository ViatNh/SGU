package OOP.TH1;
import java.util.Scanner;

// Câu 5. Viết chương trình nhập số nguyên N, kiểm tra và xuất kết quả N là số âm/zero/dương

public class Cau5 {
    public static String cau5(int n) {
        if (n >= 0) {
            if (n == 0) return "zero";
            return "duong";
        }
        return "am";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen N: ");
        int n = sc.nextInt();

        System.out.printf("%d la so %s", n, cau5(n));
    }
}
