package OOP2.TH1;
import java.util.Scanner;

// Viết chương trình nhập bán kính hình tròn. In ra chu vi, diện tích của hình tròn.

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--CHƯƠNG TRÌNH TÍNH CHU VI, DIỆN TÍCH HÌNH TRÒN--");
        System.out.print("Nhập bán kính hình tròn: ");
        double r = Double.parseDouble(sc.nextLine());
        System.out.println("Chu vi: " + (r * 2 * Math.PI));
        System.out.println("Diện tích: " + (r * r * Math.PI));

        sc.close();
    }
}
