package OOP2.TH1;
import java.util.Scanner;

// Viết chương trình nhập số nguyên n. Kiểm tra và xuất kết quả xem n là chẵn hay lẻ.

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--CHƯƠNG TRÌNH KIỂM TRA SỐ CHẴN LẺ--");
        System.out.print("Nhập vào một số nguyên: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.printf("%d là số %s", n, (n % 10) % 2 == 0 ? "chẵn" : "lẻ");

        sc.close();
    }
}
