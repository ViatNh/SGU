package OOP2.TH1;
import java.util.Scanner;

// Viết hàm tính USCLN (Ước chung lớn nhất) của 2 số. 
// Vận dụng hàm trên tính bội chung nhỏ nhất (BCNN) của 2 số nhập vào từ bàn phím.

public class Cau17 {
    public static int uscln(int a, int b) {
        int min = a < b ? a : b;
        for (int i = min; i > 0; i--)
            if ((a % i == 0) && (b % i == 0)) return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a và b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("Ước số chung lớn nhất của %d và %d là %d\n", a, b, uscln(a, b));
        System.out.printf("Bội chung nhỏ nhất của %d và %d là %d\n", a, b, (a / uscln(a, b) * b));
    

        sc.close();
    }
}
