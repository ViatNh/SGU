package OOP.TH2;
import java.util.Scanner;

// Câu 5. Viết hàm để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được nhập từ bàn
// phím. Dùng mã ASCII để kiểm tra hoặc dùng class Character: Character.isDigit(ký
// tự) để kiểm ký tự có phải là số hay không?

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi s: ");
        String s = sc.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i))) count++;
        System.out.println("Số lượng ký tự là số có trong chuỗi s: " + count);

        sc.close();
    }
}
