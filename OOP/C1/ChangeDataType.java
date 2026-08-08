package OOP.C1;
import java.util.Scanner;

public class ChangeDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        String st = sc.nextLine();

        try {
        int a = Integer.parseInt(st);
        float b = Float.parseFloat(st);

        System.out.printf("st: %s\n", st);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        } catch (NumberFormatException e) { // bắt lỗi nếu input không phải số
            System.out.println("Error: Input " + st + " khong hop le!");
        }
    }
}

// nếu chuyển đổi kiểu dữ liệu sang String thì nên sử dụng Kiểu.toString(tên biến) thay vì "" + var
// tối ưu hiệu năng