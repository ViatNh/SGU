package OOP.TH1;
import java.util.Scanner;

// Câu 22. Viết chương trình cho nhập vào số phải là số chính phương, 
// xuất số vừa nhập ra màn hình.

public class Cau22 {
    public static boolean isSCP(int n) {
        int tmp = (int)Math.sqrt(n);
        return tmp * tmp == n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("nhap vao mot so nguyen: ");
            n = sc.nextInt();
        } while (!isSCP(n));
        System.out.printf("%d la so chinh phuong", n);
    }
}
