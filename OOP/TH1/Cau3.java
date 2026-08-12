package OOP.TH1;
import java.util.Scanner;

// Câu 3. Viết chương trình nhập bán kính hình tròn, xuất chu vi, diện tích của hình tròn đó.

public class Cau3 {
    public static void propCircle(float r) {
        System.out.println("Chu vi hinh tron: " + (r * 2 * 3.14));
        System.out.println("Dien tich hinh tron: " + (r * r * 3.14));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao ban kinh hinh tron: ");
        float r = sc.nextFloat();

        propCircle(r);
    }
}
