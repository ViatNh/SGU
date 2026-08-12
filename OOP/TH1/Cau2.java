package OOP.TH1;
import java.util.Scanner;

// Câu 2. Viết chương trình nhập chiều dài, chiều rộng hình chữ nhật, xuất chu vi, diện
// tích của hình chữ nhật đó.

public class Cau2 {
    public static void propRectangle(float dai, float rong) {
        System.out.println("Chu vi hinh chu nhat: " + 2*(dai + rong));
        System.out.println("Dien tich hinh chu nhat: " + (dai * rong));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai va chieu rong cua hinh chu nhat: ");
        float dai = sc.nextInt();
        float rong = sc.nextInt();

        propRectangle(dai, rong);
    }
}
