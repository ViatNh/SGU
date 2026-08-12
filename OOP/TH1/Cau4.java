package OOP.TH1;
import java.util.Scanner;

// Câu 4. Viết chương trình nhập số nguyên N, kiểm tra và xuất kết quả N là số chẵn/lẻ

public class Cau4 {
    public static String isEven(int n) {
        if (n % 2 == 0)
            return "chan";
        return "le";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen N: ");
        int n = sc.nextInt();

        System.out.printf("%d la so %s", n, isEven(n));
    }
}
